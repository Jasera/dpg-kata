package com.gildedrose.strategy;

import com.gildedrose.ItemWrapper;

public class BackStageStrategy implements ItemUpdateStrategy {
    @Override
    public void updateItem(ItemWrapper item) {
        item.increaseQuality();

        if (item.getSellin() < 11) {
            item.increaseQuality();
        }

        if (item.getSellin() < 6) {
            item.increaseQuality();
        }
        item.reduceSellin();

        if (item.getSellin() < 0) {
            item.setFixedQuality(0);
        }
    }
}
