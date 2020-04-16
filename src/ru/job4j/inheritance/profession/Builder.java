package ru.job4j.inheritance.profession;

public class Builder extends Engineer {
    private boolean license;
    private boolean drawing;

    public void buildObject() {
    }

    public boolean getLicense() {
        return license;
    }

    public boolean getDrawing() {
        return drawing;
    }
}
