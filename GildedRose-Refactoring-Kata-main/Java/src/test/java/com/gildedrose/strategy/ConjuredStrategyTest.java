package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredStrategyTest {

    @Test
    public void testConjuredStrategyPositiveSellin() {
        ConjuredStrategy conjuredStrategy = new ConjuredStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("conjured", 1, 20));

        conjuredStrategy.updateItem(itemWrapper);

        assertEquals(0, itemWrapper.getSellin());
        assertEquals(18, itemWrapper.getQuality());
    }

    @Test
    public void testConjuredStrategyZeroSellin() {
        ConjuredStrategy conjuredStrategy = new ConjuredStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Default", 0, 20));

        conjuredStrategy.updateItem(itemWrapper);

        assertEquals(-1, itemWrapper.getSellin());
        assertEquals(16, itemWrapper.getQuality());
    }

    @Test
    public void testConjuredStrategyNegativeSellin() {
        ConjuredStrategy conjuredStrategy = new ConjuredStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Default", -1, 20));

        conjuredStrategy.updateItem(itemWrapper);

        assertEquals(-2, itemWrapper.getSellin());
        assertEquals(16, itemWrapper.getQuality());
    }
}
