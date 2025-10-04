package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    private User testUser;
    private Shop evergreens;

    @BeforeEach
    void runBefore() {
        testUser = new User("Grace", "Lovely34");
        evergreens = new Shop("Evergreens", 3.9, "Seattle");
    }

    @Test
    void testConstructor() {
        assertNotNull(testUser);
        assertEquals("Grace", testUser.getNickname());
    }

    @Test
    void testAddShopOne() {
        List<Shop> stepper = new ArrayList<Shop>();
        testUser.addShop(evergreens);
        stepper.add(evergreens);
        assertEquals(stepper, testUser.getFavorites());
    }

    @Test
    void testAddShopTwo() {
        Shop target = new Shop("Target", 2, "Vancouver");
        List<Shop> stepper = new ArrayList<Shop>();
        testUser.addShop(evergreens);
        testUser.addShop(target);
        stepper.add(evergreens);
        stepper.add(target);
        assertEquals(stepper, testUser.getFavorites());
    }

    @Test
    void testAddShopSameOne() {
        List<Shop> stepper = new ArrayList<Shop>();
        testUser.addShop(evergreens);
        testUser.addShop(evergreens);
        stepper.add(evergreens);
        assertEquals(stepper, testUser.getFavorites());
    }

    @Test
    void testCheckPasswordTrue() {
        assertTrue(testUser.checkPassword("Lovely34"));
    }

    @Test
    void testCheckPasswordFalse() {
        assertFalse(testUser.checkPassword("Lovely35"));
    }

    @Test
    void testSetPassword() {
        String old = testUser.getPassword();
        testUser.setPassword("House76!");
        String newpass = testUser.getPassword();
        assertNotEquals(old, newpass);
        assertEquals("House76!", testUser.getPassword());
    }

    @Test
    void testRemoveFavorite() {
        List<Shop> temp = new ArrayList<Shop>();
        testUser.addShop(evergreens);
        testUser.addShop(evergreens);
        testUser.removeShop(evergreens);
        assertEquals(temp, testUser.getFavorites());
    }

    @Test
    void testToJson() {
        testUser.addShop(evergreens);
        JSONObject json = testUser.toJson();
        assertEquals("Grace", json.getString("nickname"));
        assertEquals("Lovely34", json.getString("password"));

        JSONArray favorites = json.getJSONArray("favorites");
        assertEquals(1, favorites.length());
    }

    @Test
    void testFromJson() {
        JSONObject json = new JSONObject();
        json.put("username", "Kamilla");
        json.put("password", "389");

        JSONArray fav = new JSONArray();
        JSONObject shop1 = new JSONObject();
        shop1.put("name", "Eco Shop");
        shop1.put("rating", 5);
        shop1.put("location", "Canada");

        fav.put(shop1);
        json.put("favorites", fav);

        User user = User.fromJson(json);

        assertEquals("Kamilla", user.getNickname());
        assertEquals("389", user.getPassword());
        List<Shop> favorites = user.getFavorites();
        assertEquals(1, favorites.size());
        assertEquals("Eco Shop", favorites.get(0).getName());
        assertEquals(5, favorites.get(0).getRating(), 0.01);
        assertEquals("Canada", favorites.get(0).getLocation());
    }
}
