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

public class MilestoneTest {
    private Milestone testMilestone;
    private User testUser;
    private Shop evergreens1;
    private Shop evergreens2;

    @BeforeEach
    void runBefore() {
        testUser = new User("lol", "lol123");
        testMilestone = new Milestone("Favorites1", "Favorites", 0.4, false, "-", 2, testUser);
    }

    @Test
    void testConstructor() {
        assertNotNull(testMilestone);
        assertEquals("Favorites1", testMilestone.getTitle());
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
