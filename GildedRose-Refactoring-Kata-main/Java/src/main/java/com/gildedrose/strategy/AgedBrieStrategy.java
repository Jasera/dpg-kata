package com.gildedrose.strategy;

import com.gildedrose.ItemWrapper;

public class AgedBrieStrategy implements ItemUpdateStrategy {
    @Override
    public void updateItem(ItemWrapper item) {
        item.increaseQuality();

        item.reduceSellin();

        if (item.getSellin() < 0) {
            item.increaseQuality();
        }
    }


}
