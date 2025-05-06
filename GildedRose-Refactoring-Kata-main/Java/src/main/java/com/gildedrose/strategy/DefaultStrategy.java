package com.gildedrose.strategy;

import com.gildedrose.ItemWrapper;


public class DefaultStrategy implements ItemUpdateStrategy {
    @Override
    public void updateItem(ItemWrapper item) {
        item.reduceQuality();

        item.reduceSellin();

        if (item.getSellin() < 0) {
            item.reduceQuality();
        }
    }
}
