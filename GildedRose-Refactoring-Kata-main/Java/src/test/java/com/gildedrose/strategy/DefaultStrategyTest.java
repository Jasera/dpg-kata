package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStrategyTest {

    @Test
    public void testAgedBrieStrategyPositiveSellin() {
        DefaultStrategy defaultStrategy = new DefaultStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Default", 1, 20));

        defaultStrategy.updateItem(itemWrapper);

        assertEquals(0, itemWrapper.getSellin());
        assertEquals(19, itemWrapper.getQuality());
    }

    @Test
    public void testAgedBrieStrategyZeroSellin() {
        DefaultStrategy defaultStrategy = new DefaultStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Default", 0, 20));

        defaultStrategy.updateItem(itemWrapper);

        assertEquals(-1, itemWrapper.getSellin());
        assertEquals(18, itemWrapper.getQuality());
    }

    @Test
    public void testAgedBrieStrategyNegativeSellin() {
        DefaultStrategy defaultStrategy = new DefaultStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Default", -1, 20));

        defaultStrategy.updateItem(itemWrapper);

        assertEquals(-2, itemWrapper.getSellin());
        assertEquals(18, itemWrapper.getQuality());
    }
}
