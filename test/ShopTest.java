package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import java.util.ArrayList;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopTest {
    private Shop testShop;

    @BeforeEach
    void runBefore() {
        testShop = new Shop("Fresh", 4.5, "Vancouver");
    }

    @Test
    void testConstructor() {
        assertNotNull(testShop);
        assertEquals("Fresh", testShop.getName());
        assertEquals(4.5, testShop.getRating(), 0.1);
    }

    @Test
    void testAddImportOne() {
        List<String> stepper = new ArrayList<String>();
        testShop.addImport("Mexico");
        stepper.add("Mexico");
        assertEquals(stepper, testShop.getImports());
    }

    @Test
    void testAddImportTwo() {
        List<String> stepper = new ArrayList<String>();
        testShop.addImport("Mexico");
        testShop.addImport("Brazil");
        stepper.add("Mexico");
        stepper.add("Brazil");
        assertEquals(stepper, testShop.getImports());
    }

    @Test
    void testAddImportSameOne() {
        List<String> stepper = new ArrayList<String>();
        testShop.addImport("Mexico");
        testShop.addImport("Mexico");
        stepper.add("Mexico");
        assertEquals(stepper, testShop.getImports());
    }

    @Test
    void testgetInfoOne() {
        assertEquals("Fresh, Rating: 4.5, Location: Vancouver", testShop.getInfo());
    }

    @Test
    void testAddRatingSame() {
        testShop.addRating(4.5);
        assertEquals(4.5, testShop.getRating(), 0.0001);
    }

    @Test
    void testAddRatingDifferent() {
        testShop.addRating(2.7);
        assertEquals((4.5 + 2.7) / 2, testShop.getRating(), 0.0001);
    }

    @Test
    void testShopToJson() {
        Shop shop = new Shop("Eco Shop", 5, "Vancouver");
        JSONObject json = shop.toJson();

        assertEquals("Eco Shop", json.getString("name"));
        assertEquals(5, json.getInt("rating"));
    }

    @Test
    void testShopFromJson() {
        JSONObject json = new JSONObject();
        json.put("name", "Green Market");
        json.put("rating", 4);
        json.put("location", "Brazil");

        Shop shop = Shop.fromJson(json);

        assertEquals("Green Market", shop.getName());
        assertEquals(4, shop.getRating(),0.01);
        assertEquals("Brazil", shop.getLocation());
    }
}
