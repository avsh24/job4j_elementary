package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро.
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллары.
        return rsl;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar. ");

        // Тест перевода рублей в евро.
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        // Тест перевода рублей в доллары.
        int in1 = 180;
        int expected1 = 3;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 3. Test result : " + passed1);
    }
}
