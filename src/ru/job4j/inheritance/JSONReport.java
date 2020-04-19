package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String nl = System.lineSeparator();
        return String.format("{%sname: %s%s, body: %s%s}", nl, name, nl, body, nl);
    }
}
