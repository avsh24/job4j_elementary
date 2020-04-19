package ru.job4j.encapsulation.book;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Java for dummies", 619);
        Book bookTwo = new Book("Head First Java", 718);
        Book bookThree = new Book("JavaFX", 770);
        Book bookFour = new Book("Clean code", 361);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("\nReplace bookOne to bookFour");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }

        System.out.println("\nShown only: Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }

    }
}
