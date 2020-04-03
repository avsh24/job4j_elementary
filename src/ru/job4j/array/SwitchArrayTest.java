package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rs1 = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rs1, is(expect));
    }
    @Test
    public void whenSwap0to4() {
        int[] input = {4, 3, 2, 1};
        int[] expect = {1, 3, 2, 4};
        int[] rs1 = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rs1, is(expect));
    }
    @Test
    public void whenSwap0to5() {
        int[] input = {4, 3, 2, 1, 5};
        int[] expect = {5, 3, 2, 1, 4};
        int[] rs1 = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rs1, is(expect));
    }
}