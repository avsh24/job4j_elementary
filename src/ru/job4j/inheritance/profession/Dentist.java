package ru.job4j.inheritance.profession;

public class Dentist extends Doctor {
    private boolean prosthetics;
    private boolean remove;

    public void repairs(int tooth) {
    }

    public boolean getProsthetics() {
        return prosthetics;
    }

    public boolean getRemove() {
        return remove;
    }
}
