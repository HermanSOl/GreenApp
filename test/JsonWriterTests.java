package test;

import model.User;
import persistence.JsonReader;
import persistence.JsonWriter;
import model.Shop;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JsonWriterTests {
    private static final String TEST_FILE = "./data/testUser.json";

    @Test
    void testWriterInvalidFile() {
        try {
            List<User> users = new ArrayList<User>();
            User user = new User("Marrie", "Tely75");
            users.add(user);

            JsonWriter writer = new JsonWriter("./data/my\0illegal:fileName.json");
            writer.open();
            fail("IOException was expected");
        } catch (IOException e) {
            // everythings good
        }
    }

    @Test
    void testWriterNoFavorites() {
        try {
            List<User> users = new ArrayList<>();
            User user = new User("Jack", "House76");
            users.add(user);

            JsonWriter writer = new JsonWriter(TEST_FILE);
            writer.open();
            writer.write(users);
            writer.close();

            JsonReader reader = new JsonReader(TEST_FILE);
            List<User> loadedUsers = reader.read();

            assertEquals(1, loadedUsers.size());
            User neededloader = loadedUsers.get(0);
            assertEquals("Jack", neededloader.getNickname());
            assertEquals("House76", neededloader.getPassword());
            assertTrue(neededloader.getFavorites().isEmpty());
        } catch (IOException e) {
            fail("No exception should be here");
        }
    }

    @Test
    void testWriterWithFavorites() {
        try {
            List<User> users = new ArrayList<>();
            User user = new User("Jack", "House76");
            Shop shop = new Shop("Testing", 1, "Love");
            user.addShop(shop);
            users.add(user);
            JsonWriter writer = new JsonWriter(TEST_FILE);
            writer.open();
            writer.write(users);
            writer.close();

            JsonReader reader = new JsonReader(TEST_FILE);
            List<User> loadedUsers = reader.read();

            assertEquals(1, loadedUsers.size());
            User neededloader = loadedUsers.get(0);
            assertEquals("Jack", neededloader.getNickname());
            assertEquals("House76", neededloader.getPassword());
            assertEquals(0, neededloader.getFavorites().size());
        } catch (IOException e) {
            fail("No exception should be here");
        }
    }
}
