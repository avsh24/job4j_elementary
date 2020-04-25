package ru.job4j.poly.io;

public interface Transport {
    void move();

    void passengers(int number);

    int refuel(int quantity);
}
