package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.SqArea.square;

public class SqAreaTest {
    // Тест для стороны прямоугольника.
    @Test
    public void square() {
        int p = 4, k = 1;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
