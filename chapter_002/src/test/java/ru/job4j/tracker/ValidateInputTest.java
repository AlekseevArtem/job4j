package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"one", "1"})
        );
        input.askInt("Enter");
        assertThat(
                out.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
    }
    Input input = new ConsoleInput();
    Input validate = new ValidateInput(input);
    @Test
    public void whenInvalidMaxTwoTimes() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"7", "8", "3"})
        );
        input.askInt("Enter", 4);
        assertThat(
                out.toString(),
                is(String.format("Please select key from menu.%n" + "Please select key from menu.%n"))
        );
    }

    @Test
    public void whenInvalidBoth() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"7", "tee", "3"})
        );
        input.askInt("Enter", 6);
        assertThat(
                out.toString(),
                is(String.format("Please select key from menu.%n" + "Please enter validate data again.%n"))
        );
    }
}