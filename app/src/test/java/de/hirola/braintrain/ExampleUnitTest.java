package de.hirola.braintrain;

import de.hirola.braintrain.model.Color;
import de.hirola.braintrain.util.RandomListGenerator;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testRandomList() {
        RandomListGenerator generator = new RandomListGenerator();
        int round = 4;
        List<Color> randomList = generator.getRandomList(round);
        assertEquals(Color.values().length + round, randomList.size());
        for (Color color: randomList) {
            System.out.println(color.getValue());
        }
    }
}