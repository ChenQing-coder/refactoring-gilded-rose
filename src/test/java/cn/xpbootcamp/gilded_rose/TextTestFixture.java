package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.items.AgedBrie;
import cn.xpbootcamp.gilded_rose.items.Backstage;
import cn.xpbootcamp.gilded_rose.items.Regular;
import cn.xpbootcamp.gilded_rose.items.Sulfurs;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TextTestFixture {
    public static void main(String[] args) {
        String baseLine = getBaseLine();
        System.out.println(baseLine);
    }

    public static String getBaseLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");

        Item[] items = new Item[]{
                new Regular("+5 Dexterity Vest", 10, 20), //
                new AgedBrie(2, 0),
                new Regular("Elixir of the Mongoose", 5, 7), //
                new Sulfurs(0, 80), //
                new Sulfurs(-1, 80),
                new Backstage(15, 20),
                new Backstage(10, 49),
                new Backstage(5, 49),
                new Backstage(1, 20),
                // this conjured item does not work properly yet
                new Regular("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 3;

        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.update_quality();
        }
        return out.toString();
    }

}
