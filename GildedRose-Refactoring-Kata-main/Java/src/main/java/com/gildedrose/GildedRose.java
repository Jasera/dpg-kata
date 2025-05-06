package com.gildedrose;

import com.gildedrose.strategy.AgedBrieStrategy;
import com.gildedrose.strategy.BackStageStrategy;
import com.gildedrose.strategy.SulfurasStrategy;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals(AGED_BRIE)) {
                new AgedBrieStrategy().updateItem(new ItemWrapper(item));
            } else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                new BackStageStrategy().updateItem(new ItemWrapper(item));
            } else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                new SulfurasStrategy().updateItem(new ItemWrapper(item));
            } else {
                reduceQuality(item);

                reduceSellin(item);

                if (item.sellIn < 0) {
                    reduceQuality(item);
                }
            }
        }
    }

    private static void reduceQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private static void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private static void reduceSellin(Item item) {
        item.sellIn = item.sellIn - 1;
    }
}
