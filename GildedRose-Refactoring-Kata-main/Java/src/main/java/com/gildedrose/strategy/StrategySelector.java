package com.gildedrose.strategy;

import com.gildedrose.Item;

public class StrategySelector {
    static final String AGED_BRIE = "Aged Brie";
    static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
   static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";

    public static ItemUpdateStrategy selectItemStrategy(Item item) {
        return switch (item.name) {
            case AGED_BRIE -> new AgedBrieStrategy();
            case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT -> new BackStageStrategy();
            case SULFURAS_HAND_OF_RAGNAROS -> new SulfurasStrategy();
            case CONJURED_MANA_CAKE -> new ConjuredStrategy();
            default -> new DefaultStrategy();
        };
    }
}
