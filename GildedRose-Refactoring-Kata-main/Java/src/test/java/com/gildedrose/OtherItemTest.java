package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OtherItemTest {
    @Test
    void otherItemTest() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 4, 7) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Elixir of the Mongoose", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);

        app.updateQuality();
        assertEquals(2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);

        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);

        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);

        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

        app.updateQuality();
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
}
