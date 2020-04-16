package ru.job4j.inheritance.profession;

public class Programmer extends Engineer {
    private String[] certificate;
    private boolean english;

    public void createProgramm() {
    }

    public boolean getEnglish() {
        return english;
    }

    public String[] getCertificate() {
        return certificate;
    }
}
