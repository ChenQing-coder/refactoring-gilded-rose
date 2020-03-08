package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseSafetyNet {

    @Test
    public void should_return_the_same_with_baseLine_file() throws FileNotFoundException {
        String regex = "(\r\n|\r|\n|\n\r)";
        String result = TextTestFixture.getBaseLine().replaceAll(regex, "");
        Scanner scanner = new Scanner(new File("src/test/baseLine.txt"), "UTF-8");
        String baseLine = scanner.useDelimiter("\\A").next().replaceAll(regex, "");
        ;
        scanner.close(); // Put this call in a finally block
        assertThat(result).isEqualTo(baseLine);

    }
}
