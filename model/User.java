package model;

import org.json.JSONObject;

import persistence.Writable;

import org.json.JSONArray;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// User with nickname, id and a list of favorite shops.

public class User implements Writable {
    private String nickname;
    private String password;
    private List<Shop> favorites;
    private EventLog eventLog;
    private HashSet<Milestone> milestones;
    private HashMap<String, User> friends;

    // Creates an Instance of User with nickname, password id and empty list of
    // favorites
    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;

        favorites = new ArrayList<Shop>();
        eventLog = eventLog.getInstance();
        milestones = new HashSet<>();
        friends = new HashMap<>();

        eventLog.logEvent(new Event("Created a new User: " + nickname));
    }

    // MODFIES: this
    // EFFECTS: adds the given shop to the list of favorites
    // if not in the list already
    public void addShop(Shop s) {
        if (!favorites.contains(s)) {
            favorites.add(s);
        }
        eventLog.logEvent(new Event("Added " + s.getName() + " to the list of favorites"));
    }

    // MODIFIES: this
    // EFFECTS: adds the given milestone to the list of milestones
    public void addMilestone(Milestone m){
        milestones.add(m);
    } 

    // MODIFIES: this
    // EFFECTS: add the given user to the friend list
    public void addFriend(User u) {
        friends.put(u.nickname, u);
    }

    // MODIFIES: this
    // EFFECTS: removes the given shop from the list
    public void removeShop(Shop shop) {
        favorites.remove(shop);
    }

    // EFFECTS: checks whether the given string equals to password
    public boolean checkPassword(String word) {
        return password.equals(word);
    }

    // MODIFIES: this
    // EFFECTS: sets the password to the given string
    public void setPassword(String word) {
        password = word;
        eventLog.logEvent(new Event("Set Password"));
    }

    // EFFECTS: allows the user to be written in the json file
    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("nickname", nickname);
        json.put("password", password);

        JSONArray fav = new JSONArray();
        for (Shop shop : favorites) {
            fav.put(shop.toJson());
        }

        json.put("favorites", fav);
        return json;
    }
    
    // EFFECTS: convert to user json file
    public static User fromJson(JSONObject json) {
        User user = new User(json.getString("username"), json.getString("password"));
        JSONArray favArray = json.getJSONArray("favorites");

        for (int i = 0; i < favArray.length(); i++) {
            JSONObject shopJson = favArray.getJSONObject(i);
            user.addShop(Shop.fromJson(shopJson)); 
        }

        return user;
    }

    // GETTER METHODS

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public List<Shop> getFavorites() {
        return favorites;
    }

    public HashSet<Milestone> getMilestones() {
        return milestones;
    }

    public HashMap<String,User> getFriends() {
        return friends;
    }

}
