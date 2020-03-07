package cn.xpbootcamp.gilded_rose;

public class Item {
    protected String name;
    protected int sellIn;
    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void update() {
        updateQuality();

        updateSellIn();

        updateQualityAfterExpired();
    }

    protected void updateQuality() {

    }

    protected void updateSellIn() {

    }

    protected void updateQualityAfterExpired() {

    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
