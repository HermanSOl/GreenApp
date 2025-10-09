package test;

import java.util.List;

import org.json.JSONObject;

import java.util.ArrayList;

// Represents a shop having a name, rating,a list of countries of imports,
//  location and an id

public class Shop {
    private String name;
    private double rating; // RESTRAINT: 0<=rating<=5
    private List<String> imports;
    private String location;

    // EFFECTS: creates a new instance of Shop with name, given rating,
    // no imports, location and id

    public Shop(String name, double rating, String location) {
        this.name = name;
        this.rating = rating;
        imports = new ArrayList<String>();
        this.location = location;
    }

    // MODIFIES: this
    // EFFECTS: adds a country to the list of imports
    // if a country is already in the list, don't add anything

    public void addImport(String imp) {
        if (!imports.contains(imp)) {
            imports.add(imp);
        }
    }

    // EFFECTS: returns all info about a store in form of string

    public String getInfo() {
        return getName() + ", Rating: " + Double.toString(rating) + ", Location: "
                + getLocation();
    }

    // MODIFIES: this
    // EFFECTS: averages the rating of the store based on the current rating
    // and number provided
    public void addRating(Double num) {
        rating = (rating + num) / 2;
    }

    /// EFFECTS: converts shop to appropriate json
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("rating", rating);
        json.put("location", location);
        return json;
    }

    // EFFECTS: returns a shop from json to normal
    public static Shop fromJson(JSONObject json) {
        return new Shop(json.getString("name"), json.getDouble("rating"), json.getString("location"));
    }

    // GETTER METHODS

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public List<String> getImports() {
        return imports;
    }

    public String getLocation() {
        return location;
    }
}
