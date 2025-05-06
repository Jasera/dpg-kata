package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieStrategyTest {

    @Test
    public void testAgedBrieStrategyPositiveSellin() {
        AgedBrieStrategy agedBrieStrategy = new AgedBrieStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Aged Brie", 1, 20));

        agedBrieStrategy.updateItem(itemWrapper);

        assertEquals(0, itemWrapper.getSellin());
        assertEquals(21, itemWrapper.getQuality());
    }

    @Test
    public void testAgedBrieStrategy0Sellin() {
        AgedBrieStrategy agedBrieStrategy = new AgedBrieStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Aged Brie", 0, 20));

        agedBrieStrategy.updateItem(itemWrapper);

        assertEquals(-1, itemWrapper.getSellin());
        assertEquals(22, itemWrapper.getQuality());
    }

    @Test
    public void testAgedBrieStrategyNegativeSellin() {
        AgedBrieStrategy agedBrieStrategy = new AgedBrieStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Aged Brie", -1, 20));

        agedBrieStrategy.updateItem(itemWrapper);

        assertEquals(-2, itemWrapper.getSellin());
        assertEquals(22, itemWrapper.getQuality());
    }
}
