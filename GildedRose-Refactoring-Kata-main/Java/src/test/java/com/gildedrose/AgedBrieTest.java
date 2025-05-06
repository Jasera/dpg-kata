package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    void testAgedBrieCutover0Sellin() {
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 0) //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);

        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);

        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
    }

    @Test
    void testAgedBrieCutover50Quality() {
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 48) //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);

        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);

        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testAgedBrie30Days() {
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 0) //
        };
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 30; i++) {
            app.updateQuality();
        }
        assertEquals(-28, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }
}
