package persistence;

import model.EventLog;
import model.Shop;
import model.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Represents a reader that reads user data from JSON file
public class JsonReader {
    private String source;

    // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

    // EFFECTS: reads user data from file and returns it as a User object;
    // throws IOException if an error occurs reading data from file
    public List<User> read() throws IOException {
        String jsonData = new String(Files.readAllBytes(Paths.get(source)));
        JSONArray jsonArray = new JSONArray(jsonData);
        return parseUsers(jsonArray);
    }

    // EFFECTS: parses Users from JSON
    private List<User> parseUsers(JSONArray jsonArray) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonUser = jsonArray.getJSONObject(i);
            users.add(parseUser(jsonUser)); // Convert JSON object to User object
        }
        return users;
    }

    // EFFECTS: parses user from JSON object and returns it
    private User parseUser(JSONObject jsonUser) {
        String nickname = jsonUser.optString("nickname", "default_nickname");
        String password = jsonUser.optString("password", "default_password");

        User user = new User(nickname, password);

        if (jsonUser.has("favorites") && jsonUser.get("favorites") instanceof JSONArray) {
            JSONArray jsonFavorites = jsonUser.getJSONArray("favorites");
            for (int i = 0; i < jsonFavorites.length(); i++) {
                try {
                    String shopName = jsonFavorites.getString(i);
                    user.addShop(new Shop(shopName, 0.0, "Canada"));
                } catch (JSONException e) {
                    System.err.println("Skipping invalid favorite shop: " + e.getMessage());
                }
            }
        }
        EventLog.getInstance().clear();

        return user;
    }

}
