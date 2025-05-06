package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstageTest {
    @Test
    void testBackStagePass11Days() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20) //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);

        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);

        app.updateQuality();
        assertEquals(8, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);

        app.updateQuality();
        assertEquals(7, app.items[0].sellIn);
        assertEquals(27, app.items[0].quality);

        app.updateQuality();
        assertEquals(6, app.items[0].sellIn);
        assertEquals(29, app.items[0].quality);

        app.updateQuality();
        assertEquals(5, app.items[0].sellIn);
        assertEquals(31, app.items[0].quality);

        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
        assertEquals(34, app.items[0].quality);

        app.updateQuality();
        assertEquals(3, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);

        app.updateQuality();
        assertEquals(2, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);

        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(43, app.items[0].quality);

        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(46, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testBackStagePassMaxAQuality() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49) //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
}
