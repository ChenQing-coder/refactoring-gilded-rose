package cn.xpbootcamp.gilded_rose.items;

import cn.xpbootcamp.gilded_rose.Item;

public class Sulfurs extends Item {
    public Sulfurs(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        return;
    }

    @Override
    public void updateQualityWhenExpiration() {
        return;
    }

    @Override
    public void updateQuality() {
        return;
    }
}
