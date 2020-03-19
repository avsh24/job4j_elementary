package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    // Тест для проверки расстояний между точками в системе координат.
    @Test
    public void distance() {
        double in = 2.0;
        double x1 = 0;
        double y1 = 0;
        double x2 = 2;
        double y2 = 0;
        double expected = 2.0;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }
}
