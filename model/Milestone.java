package model;

import java.util.Objects;
 
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
    private EventLog eventLog;

    // Creates an Instance of Milestone with title, rarity, status, 
    // picture, condition and User

    public Milestone(String title, String type, Double rarity, int condition, User user){
        this.title = title;
        this.rarity = rarity;
        this.type = type;
        status = false;
        image = "data/resources/IncorrectMark.png";
        this.condition = condition;
        this.user = user;
    }


    // MODIFIES: this
    // EFFECTS: a helper function for checkCondition()
    // sets the milestone as completed and adds it to user's collection
    public void setToComplete(){
        status = true;
        user.addMilestone(this);
        image = "data/resources/CorrectMark.png";
        eventLog.logEvent(new Event(user.getNickname() + "has achieved " + title + "milestone"));
    }

    // MODIFIES: this
    // EFFECTS: checks if the condition has been satisfied, changes status to
    // true if so

    public void checkCondition(){
        switch (type) {
            case "Favorites":
                if (user.getFavorites().size() >= condition) {
                    setToComplete();
                }
                break;
            case "Friends":
                if (user.getFriends().size() >= condition) {
                    setToComplete();
                }
                break;
            case "Distance":
                //if (user.getMiles().size() >= condition) {
                    status = true;
                    // user.addMilestone(this)
                    // image = newImage (be the completion image)
                //}
                break;
            default:
                break;
        }
    }

    // EFFECTS: overrides equals for future hashset comparesements
    // MILESTONES ARE EQUAL IF THEY HAVE EQUAL:
    // title  rarity  type  user 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Milestone)) return false;
        Milestone o = (Milestone) obj;
        return title.equals(o.title) && rarity.equals(o.rarity) && type.equals(o.type)
        && user.equals(o.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type);
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

    public String getType(){
        return type;
    }


}
