package ru.job4j.poly.io;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Посадка пассажиров");
    }

    @Override
    public int refuel(int quantityFuel) {
        int price = 45;
        return quantityFuel * price;
    }
}
