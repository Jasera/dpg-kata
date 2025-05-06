package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackStageStrategyTest {

    @Test
    void testBackStageStrategySellIn11Days() {
        BackStageStrategy backStageStrategy = new BackStageStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Back Stage", 11, 20));

        backStageStrategy.updateItem(itemWrapper);

        assertEquals(10, itemWrapper.getSellin());
        assertEquals(21, itemWrapper.getQuality());
    }

    @Test
    void testBackStageStrategySellIn10Days() {
        BackStageStrategy backStageStrategy = new BackStageStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Back Stage", 10, 20));

        backStageStrategy.updateItem(itemWrapper);

        assertEquals(9, itemWrapper.getSellin());
        assertEquals(22, itemWrapper.getQuality());
    }

    @Test
    void testBackStageStrategySellIn6Days() {
        BackStageStrategy backStageStrategy = new BackStageStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Back Stage", 6, 20));

        backStageStrategy.updateItem(itemWrapper);

        assertEquals(5, itemWrapper.getSellin());
        assertEquals(22, itemWrapper.getQuality());
    }

    @Test
    void testBackStageStrategySellIn5Days() {
        BackStageStrategy backStageStrategy = new BackStageStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Back Stage", 5, 20));

        backStageStrategy.updateItem(itemWrapper);

        assertEquals(4, itemWrapper.getSellin());
        assertEquals(23, itemWrapper.getQuality());
    }

    @Test
    void testBackStageStrategySellIn1Day() {
        BackStageStrategy backStageStrategy = new BackStageStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Back Stage", 1, 20));

        backStageStrategy.updateItem(itemWrapper);

        assertEquals(0, itemWrapper.getSellin());
        assertEquals(23, itemWrapper.getQuality());
    }

    @Test
    void testBackStageStrategySellIn0Day() {
        BackStageStrategy backStageStrategy = new BackStageStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Back Stage", 0, 20));

        backStageStrategy.updateItem(itemWrapper);

        assertEquals(-1, itemWrapper.getSellin());
        assertEquals(0, itemWrapper.getQuality());
    }

}
