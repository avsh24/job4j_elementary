package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        String nl = System.lineSeparator();
        return String.format("{%s name: %s%s, body: %s%s}", nl, name, nl, body, nl);
    }
}
