package ru.job4j.oop;

public class DummyDic {
    public String endToRus(String end) {
        String text = "Неизвестное слово: " + end;
        return text;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String rsl = dummyDic.endToRus("java");
        System.out.println(rsl);
    }
}
