package model;

import model.User;
import persistence.JsonReader;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JsonReaderTests {

    @Test
    void testReaderNonExistentFile() {
        JsonReader reader = new JsonReader("./data/emptyfile.json");
        try {
            List<User> users = reader.read();
            fail("IOException expected");
        } catch (IOException e) {
            // good
        }
    }

    @Test
    void testReaderSingleUserNoFavorites() {
        JsonReader reader = new JsonReader("./data/testReaderNoFavorites.json");
        try {
            List<User> users = reader.read();
            assertEquals(1, users.size());

            User user = users.get(0);
            assertEquals("emptyUser", user.getNickname());
            assertEquals("password123", user.getPassword());
            assertTrue(user.getFavorites().isEmpty());
        } catch (IOException e) {
            fail("Not supposed to happen");
        }
    }

    @Test
    void testReaderNotEmptyUser() {
        JsonReader reader = new JsonReader("./data/testReaderFavorites.json");
        try {
            List<User> users = reader.read();
            assertEquals(1, users.size());

            User user = users.get(0);
            assertEquals("testUser", user.getNickname());
            assertEquals("securePass", user.getPassword());
            assertTrue(user.getFavorites().isEmpty());
        } catch (IOException e) {
            fail("Not supposed to happen");
        }
    }
}
