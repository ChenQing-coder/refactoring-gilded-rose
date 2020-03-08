package cn.xpbootcamp.gilded_rose.items;

import cn.xpbootcamp.gilded_rose.Item;

public class Backstage extends Item {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQualityWhenExpiration() {
        quality = 0;
    }

    @Override
    public void updateQuality() {
        increaseOneWhenMoreThan50();

        if (sellIn < 11) {
            increaseOneWhenMoreThan50();
        }

        if (sellIn < 6) {
            increaseOneWhenMoreThan50();
        }

    }

}
