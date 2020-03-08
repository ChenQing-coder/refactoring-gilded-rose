package cn.xpbootcamp.gilded_rose.items;

import cn.xpbootcamp.gilded_rose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    public boolean isAgedBrie() {
        return true;
    }

    @Override
    public void updateQualityWhenExpiration() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
