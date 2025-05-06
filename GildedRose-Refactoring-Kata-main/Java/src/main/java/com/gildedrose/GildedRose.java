package com.gildedrose;

import com.gildedrose.strategy.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdateStrategy itemUpdateStrategy = StrategySelector.selectItemStrategy(item);

            itemUpdateStrategy.updateItem(new ItemWrapper(item));
        }
    }
}
