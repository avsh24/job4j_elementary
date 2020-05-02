package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenArg() {
        int rsl = Fact.calc(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenArg1() {
        int rsl = Fact.calc(5);
    }
}
