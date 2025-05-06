package com.gildedrose;

public class ItemWrapper {
    private Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public void increaseQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    public void reduceQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    public void reduceSellin() {
        item.sellIn = item.sellIn - 1;
    }

    public int getSellin() {
        return item.sellIn;
    }

    public int getQuality() {
        return item.quality;
    }
}
