package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasStrategyTest {

    @Test
    public void testSulfurasStrategy() {
        SulfurasStrategy strategy = new SulfurasStrategy();

        ItemWrapper itemWrapper = new ItemWrapper(new Item("Back Stage", 1, 20));

        strategy.updateItem(itemWrapper);

        assertEquals(1, itemWrapper.getSellin());
        assertEquals(80, itemWrapper.getQuality());
    }

}
