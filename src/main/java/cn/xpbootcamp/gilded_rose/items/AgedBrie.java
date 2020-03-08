package cn.xpbootcamp.gilded_rose.items;

import cn.xpbootcamp.gilded_rose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQualityWhenExpiration() {
        increaseOneWhenMoreThan50();
    }

    @Override
    public void updateQuality() {
        quality = quality + 1;
    }
}
