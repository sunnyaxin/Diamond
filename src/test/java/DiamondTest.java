import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class DiamondTest {
    private final Diamond diamond = new Diamond();

    @Test
    public void test_diamond_when_n_1() throws Exception {
        assertEquals(Collections.singletonList("*"), diamond.diamond(1));
    }

    @Test
    public void test_diamond_when_n_2() throws Exception {
        assertEquals(Arrays.asList(
                " * ",
                "***",
                " * "), diamond.diamond(2));
    }

    @Test
    public void test_diamond_when_n_3() throws Exception {
        assertEquals(Arrays.asList(
                "  *  ",
                " *** ",
                "*****",
                " *** ",
                "  *  "), diamond.diamond(3));
    }
}
