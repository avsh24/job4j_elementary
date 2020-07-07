package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenMatrix() {
        Integer[][] array = new Integer[][]{
                new Integer[]{1, 2},
                new Integer[]{3, 4}
        };
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = Matrix.convertToList(array);
        assertThat(result, is(expected));
    }
}
