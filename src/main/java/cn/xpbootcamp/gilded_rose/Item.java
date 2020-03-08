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
        if (!isAgedBrie()
                && !isBackstage()) {
            if (quality > 0) {
                if (!isSulfurs()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstage()) {
                    if (sellIn < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }
    }

    public void updateQualityWhenExpiration() {
        if (!isAgedBrie()) {
            if (!isBackstage()) {
                if (quality > 0) {
                    if (!isSulfurs()) {
                        quality = quality - 1;
                    }
                }
            } else {
                quality = 0;
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }

    public boolean isExpired() {
        return sellIn < 0;
    }

    public void updateSellIn() {
        if (!isSulfurs()) {
            sellIn = sellIn - 1;
        }
    }

    public boolean isSulfurs() {
        return false;
    }

    public boolean isBackstage() {
        return false;
    }

    public boolean isAgedBrie() {
        return false;
    }
}
