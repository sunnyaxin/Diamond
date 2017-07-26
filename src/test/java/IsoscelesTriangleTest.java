import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class IsoscelesTriangleTest {
    private final IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();

    @Test
    public void test_draw_isosceles_when_n_1() throws Exception {
        assertEquals(Collections.singletonList("*"), isoscelesTriangle.drawIsosceles(1));
    }

    @Test
    public void test_draw_isosceles_when_n_3() throws Exception {
        assertEquals(Arrays.asList("  *  ",
                                        " *** ",
                                        "*****"),
                isoscelesTriangle.drawIsosceles(3));
    }
}
