package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredTest {
    @Test
    void otherItemTest() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 4, 7) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);

        app.updateQuality();
        assertEquals(2, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);

        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);

        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

        app.updateQuality();
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
}
