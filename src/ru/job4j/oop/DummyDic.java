package ru.job4j.oop;

public class DummyDic {
    public String endToRus(String end) {
        System.out.println(end);
        return end;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        dummyDic.endToRus("Неизвестное слово");
    }
}
