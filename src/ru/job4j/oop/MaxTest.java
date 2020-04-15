package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenSecondMax() {
        Max check = new Max();
        int result = check.max(1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax1() {
        Max check = new Max();
        int result = check.max(5, 4, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax2() {
        Max check = new Max();
        int result = check.max(5, 4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenSecondMax3() {
        Max check = new Max();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax4() {
        Max check = new Max();
        int result = check.max(5, 5, 5, 6);
        assertThat(result, is(6));
    }
}
