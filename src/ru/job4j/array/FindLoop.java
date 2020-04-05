package ru.job4j.array;

public class FindLoop {
    /**
     * Поиск элемента в массиве
     * @param data заданный массив.
     * @param el искомое значение.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < el; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    /**
     * Поиск по массиву, но не во всем массиве, а только в указанном диапазоне
     * @param data массив чисел.
     * @param el элемент, который нужно найти.
     * @param start индекс с которого начинаем поиск.
     * @param finish индекс которым заканчиваем поиск.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
