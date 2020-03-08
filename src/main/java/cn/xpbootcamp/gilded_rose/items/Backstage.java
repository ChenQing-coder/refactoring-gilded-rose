package cn.xpbootcamp.gilded_rose.items;

import cn.xpbootcamp.gilded_rose.Item;

public class Backstage extends Item {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public boolean isBackstage() {
        return true;
    }

    @Override
    public void updateQualityWhenExpiration() {
        quality = 0;
    }
}
