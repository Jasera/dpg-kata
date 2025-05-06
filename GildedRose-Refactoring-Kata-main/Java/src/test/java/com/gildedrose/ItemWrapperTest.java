package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemWrapperTest {

    @Test
    void increaseQuality() {
        ItemWrapper itemWrapper = new ItemWrapper(new Item("test", 0 , 49));
        itemWrapper.increaseQuality();

        assertEquals(50, itemWrapper.getQuality());
    }

    @Test
    void increaseQuality50AndAbove() {
        ItemWrapper itemWrapper = new ItemWrapper(new Item("test", 0 , 50));
        itemWrapper.increaseQuality();

        assertEquals(50, itemWrapper.getQuality());
    }

    @Test
    void reduceSellin() {
        ItemWrapper itemWrapper = new ItemWrapper(new Item("test", 1 , 50));
        itemWrapper.reduceSellin();

        assertEquals(0, itemWrapper.getSellin());
    }
}
