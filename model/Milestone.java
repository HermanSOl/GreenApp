package model;

import org.json.JSONObject;

import persistence.Writable;
import model.User;

import java.util.List;
import java.util.*;

// Milestone that User can have. 
// Has title, rarity, status of completion, picture 
// as well as a condition and a User its tied to
public class Milestone {
    private String title;
    private String type; // either Favorites, Friends, Distance
    private Double rarity; // 0 - 100 %
    private Boolean status;
    private String image;
    private int condition;
    private User user;

    // Creates an Instance of Milestone with title, rarity, status, 
    // picture, condition and User

    public Milestone(String title, String type, Double rarity, Boolean status, String image,
    int condition, User user){
        this.title = title;
        this.rarity = rarity;
        this.status = status;
        this.image = title;
        this.condition = condition;
        this.user = user;
    }


    // MODIFIES: this
    // EFFECTS: checks if the condition has been satisfied, changes status to
    // true if so

    public void checkCondition(){
        switch (type) {
            case "Favorites":
                if (user.getFavorites().size() >= condition) {
                    status = true;
                    // user.addMilestone(this)
                    // image = newImage (be the completion image)
                }
                break;
            case "Friends":
                //if (user.getFriends().size() >= condition) {
                    status = true;
                    // user.addMilestone(this)
                    // image = newImage (be the completion image)
                //}
                break;
            case "Distance":
                //if (user.getMiles().size() >= condition) {
                    status = true;
                    // user.addMilestone(this)
                    // image = newImage (be the completion image)
                //}
                break;
            default:
                System.out.print("Not right type of Milestone");
                break;
        }
    }

    // GETTER METHODS

    public String getTitle(){
        return title;
    }

    public Double getRarity(){
        return rarity;
    }

    public Boolean getStatus(){
        return status;
    }

    public String getImagePath(){
        return image;
    }
    
    public User getUser(){
        return user;
    }


}
