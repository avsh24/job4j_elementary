package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    // Тест расчета идеальный вес для мужчин.
    @Test
    public void manWeight() {
        double in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    // Тест расчета идеальный вес для женщин.
    @Test
    public void womanWeight() {
        double in = 160;
        double expected = 57.49999999999999;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
