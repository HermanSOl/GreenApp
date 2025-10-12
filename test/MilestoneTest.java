package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Milestone;
import model.User;
import model.Shop;

public class MilestoneTest {
    private Milestone testMilestone;
    private User testUser;
    private Shop evergreens1;
    private Shop evergreens2;

    @BeforeEach
    void runBefore() {
        testUser = new User("lol", "lol123");
        testMilestone = new Milestone("Favorites1", "Favorites", 0.4, "-", 2, testUser);
        evergreens1 = new Shop("Cool store", 0, "dm");
        evergreens2 = new Shop("Cool store2", 0, "dm");
    }

    @Test
    void testConstructor() {
        assertNotNull(testMilestone);
        assertEquals("Favorites1", testMilestone.getTitle());
        assertEquals(testUser, testMilestone.getUser());
        assertEquals("Favorites", testMilestone.getType());
    }

    @Test
    void testCheckFavoritesConditionFalse(){
        testMilestone.checkCondition();
        assertFalse(testMilestone.getStatus());
    }

    @Test
    void testCheckFavoritesConditionTrue(){
        testUser.addShop(evergreens1);
        testUser.addShop(evergreens2);
        testMilestone.checkCondition();
        assertTrue(testMilestone.getStatus());
    }


    // MAKE TESTS FOR FRIENDS, DISTANCE TYPES, CHECK MORE BOUNDARIES
    // MAKE TESTS FOR FRIENDS, DISTANCE TYPES, CHECK MORE BOUNDARIES
    // MAKE TESTS FOR FRIENDS, DISTANCE TYPES, CHECK MORE BOUNDARIES
    // MAKE TESTS FOR FRIENDS, DISTANCE TYPES, CHECK MORE BOUNDARIES
    // MAKE TESTS FOR FRIENDS, DISTANCE TYPES, CHECK MORE BOUNDARIES
}
