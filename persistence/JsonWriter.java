package persistence;

import model.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Represents a writer that writes JSON representation of a User to file
public class JsonWriter { // Inspired by JsonWriter.java from jsonserializationdemo
    private static final int TAB = 4;
    private PrintWriter writer;
    private String destination;

    // EFFECTS: constructs writer to write to destination file
    public JsonWriter(String destination) {
        this.destination = destination;
    }

    // MODIFIES: this
    // EFFECTS: opens writer; throws FileNotFoundException if destination file
    // cannot be opened for writing
    public void open() throws FileNotFoundException {
        writer = new PrintWriter(new File(destination));
    }

    // MODIFIES: this
    // EFFECTS: writes JSON representation of Users to file
    public void write(List<User> users) {
        JSONArray jsonArray = new JSONArray();

        for (User user : users) {
            jsonArray.put(user.toJson());
        }

        saveToFile(jsonArray.toString(4));
    }

    // MODIFIES: this
    // EFFECTS: closes writer
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }

    // MODIFIES: this
    // EFFECTS: writes string to file
    private void saveToFile(String json) {
        writer.print(json);
    }
}
