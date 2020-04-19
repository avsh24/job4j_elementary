package ru.job4j.encapsulation.shop;

public class Shop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = products[index + 1];
        for (int i = index + 1; i < products.length; i++) {
            if (products[i] != null) {
                products[i - 1] = products[i];
                products[i] = null;
            } else {
                products[products.length - 1] = null;
            }
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 2);

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        delete(products, 2);
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        products[1] = null;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
