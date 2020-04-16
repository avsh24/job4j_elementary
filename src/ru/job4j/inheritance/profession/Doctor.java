package ru.job4j.inheritance.profession;

public class Doctor extends Profession {
    private String[] professionalSkills;

    public void diagnose(Pacient pacient) {
    }

    public String[] getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(String[] professionalSkills) {
        this.professionalSkills = professionalSkills;
    }
}
