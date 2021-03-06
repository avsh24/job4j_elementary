package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (int index = 0; index < abuses.length; index++) {
            if (abuses[index].equals(value)) {
                return false;
            }
        }
         //if contains throw ElementAbuseException;
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] source = {"One", "Two", "Three"};
        try {
            int index = indexOf(source, "One");
            System.out.println("Item found: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
