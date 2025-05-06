package com.gildedrose.strategy;

import com.gildedrose.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrategySelectorTest {

    @Test
    void getSulfurasStrategy() {
        ItemUpdateStrategy itemUpdateStrategy = StrategySelector.selectItemStrategy(new Item(StrategySelector.SULFURAS_HAND_OF_RAGNAROS, 10, 20));

        Assertions.assertInstanceOf(SulfurasStrategy.class, itemUpdateStrategy);
    }

    @Test
    void getAgedBrieStrategy() {
        ItemUpdateStrategy itemUpdateStrategy = StrategySelector.selectItemStrategy(new Item(StrategySelector.AGED_BRIE, 10, 20));

        Assertions.assertInstanceOf(AgedBrieStrategy.class, itemUpdateStrategy);
    }

    @Test
    void getBackstagePassesStrategy() {
        ItemUpdateStrategy itemUpdateStrategy = StrategySelector.selectItemStrategy(new Item(StrategySelector.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 10, 20));

        Assertions.assertInstanceOf(BackStageStrategy.class, itemUpdateStrategy);
    }

    @Test
    void getDefaultStrategy() {
        ItemUpdateStrategy itemUpdateStrategy = StrategySelector.selectItemStrategy(new Item("RANDOM NAME", 10, 20));

        Assertions.assertInstanceOf(DefaultStrategy.class, itemUpdateStrategy);
    }

    @Test
    void getConjuredStrategy() {
        ItemUpdateStrategy itemUpdateStrategy = StrategySelector.selectItemStrategy(new Item(StrategySelector.CONJURED_MANA_CAKE, 10, 20));

        Assertions.assertInstanceOf(ConjuredStrategy.class, itemUpdateStrategy);
    }
}
