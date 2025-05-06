package com.gildedrose.strategy;

import com.gildedrose.ItemWrapper;

public class SulfurasStrategy implements ItemUpdateStrategy {
    @Override
    public void updateItem(ItemWrapper item) {
        item.setFixedQuality(80);
    }
}
