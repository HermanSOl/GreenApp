package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Milestone;
import model.User;
import model.Shop;

public class MilestoneTest {
    private Milestone testMilestoneFriends;
    private Milestone testMilestoneFavorites;
    private User testUser;
    private Shop evergreens1;
    private Shop evergreens2;

    @BeforeEach
    void runBefore() {
        testUser = new User("lol", "lol123");
        testMilestoneFavorites = new Milestone("Favorites1", "Favorites", 0.4, 2, testUser);
        testMilestoneFriends = new Milestone("Friends1", "Friends", 0.4, 2, testUser);
        evergreens1 = new Shop("Cool store", 0, "dm");
        evergreens2 = new Shop("Cool store2", 0, "dm");
    }

    @Test
    void testConstructor() {
        assertNotNull(testMilestoneFavorites);
        assertEquals("Favorites1", testMilestoneFavorites.getTitle());
        assertEquals(testUser, testMilestoneFavorites.getUser());
        assertEquals("Favorites", testMilestoneFavorites.getType());
    }

    @Test
    void testCheckFavoritesConditionFalse(){
        testMilestoneFavorites.checkCondition();
        assertFalse(testMilestoneFavorites.getStatus());
    }

    @Test
    void testCheckFavoritesConditionTrue(){
        testUser.addShop(evergreens1);
        testUser.addShop(evergreens2);
        testMilestoneFavorites.checkCondition();
        assertTrue(testMilestoneFavorites.getStatus());
    }

    @Test
    void testcheckFriendsConditionFalse(){
        testUser.addFriend(testUser);
        testMilestoneFriends.checkCondition();
        assertFalse(testMilestoneFriends.getStatus());
    }

    @Test
    void testcheckFriendsConditionTrue(){
        User newguy = new User("gy", "sdf");
        testUser.addFriend(testUser);
        testUser.addFriend(newguy);
        testMilestoneFriends.checkCondition();
        assertTrue(testMilestoneFriends.getStatus());
    }
}
