package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {
    // Тест для проверки расстояний между точками в системе координат.
    @Test
    public void distance() {
        double in = 2.0;
        double expected = 1.41;
        double out = Math.sqrt(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
