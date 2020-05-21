package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.encapsulation.tracker.StubInput;
import ru.job4j.encapsulation.tracker.ValidateInput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
//        String[] data = {"one", "1"};
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"one", "1"})
        );
        input.askInt("Enter");
        assertThat(
                mem,
                is(String.format("Please enter validate data again.%n"))
        );
        System.setOut(out);
    }

    @Test
    public void whenInvalidInput1() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
//        String[] data = {"10", "1"};
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"10", "1"})
        );
        input.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Please select key from menu.%n"))
        );
        System.setOut(out);
    }
}
