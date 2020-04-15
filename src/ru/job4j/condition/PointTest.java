package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        Point third = new Point(0, 4);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 6D;
        assertEquals(result, expected, 0.01);
    }

    // Тест для проверки расстояний между точками в системе координат.
//    @Test
//    public void distance() {
//        double x1 = 0;
//        double y1 = 0;
//        double x2 = 2;
//        double y2 = 0;
//        double expected = 2.0;
//        double out = Point.distance(0, 0, 2, 0);
//        Assert.assertEquals(expected, out, 0.01);
//    }
}
