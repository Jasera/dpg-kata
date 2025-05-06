package com.gildedrose.strategy;

import com.gildedrose.Item;

public class StrategySelector {
    static final String AGED_BRIE = "Aged Brie";
    static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public static ItemUpdateStrategy selectItemStrategy(Item item) {
        if (item.name.equals(AGED_BRIE)) {
            return new AgedBrieStrategy();
        } else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            return new BackStageStrategy();
        } else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            return new SulfurasStrategy();
        } else {
            return new DefaultStrategy();
        }
    }
}
