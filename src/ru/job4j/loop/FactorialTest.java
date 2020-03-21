package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int result = Factorial.calc(5);
        Assert.assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        Assert.assertThat(result, is(1));
    }
}
