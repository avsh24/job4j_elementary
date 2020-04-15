package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

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

//    @Test
//    public void whenAreaSetThreePointsThenTriangleArea() {
//        Point a = new Point(0, 0);
//        Point b = new Point(0, 2);
//        Point c = new Point(2, 0);
//        ru.job4j.oop.Triangle triangle = new Triangle(a, b, c);
//        double result = triangle.area();
//        assertThat(result, closeTo(2.0, 2.0));
//    }

//    @Test
//    public void whenExist() {
//        boolean result = Triangle.exist(2.0, 2.0, 2.0);
//        assertThat(result, is(true));
//    }
}
