package com.gildedrose.strategy;

import com.gildedrose.ItemWrapper;

public class ConjuredStrategy implements ItemUpdateStrategy {
    @Override
    public void updateItem(ItemWrapper item) {
        item.reduceQuality();
        item.reduceQuality();

        item.reduceSellin();

        if (item.getSellin() < 0) {
            item.reduceQuality();
            item.reduceQuality();
        }
    }
}
