package cn.xpbootcamp.gilded_rose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateOneDay() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateQualityWhenExpiration();
        }
    }

    public void updateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public void updateQualityWhenExpiration() {
        if (quality > 0) {
            quality = quality - 1;
        }

    }

    public boolean isExpired() {
        return sellIn < 0;
    }

    public void updateSellIn() {
        sellIn = sellIn - 1;
    }

    public void increaseOneWhenMoreThan50() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
