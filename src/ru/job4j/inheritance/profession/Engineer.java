package ru.job4j.inheritance.profession;

public class Engineer extends Profession {
    private String[] projects;
    private String[] skills;
    private int experience;

    public void createProject(Project project) {
    }

    public String[] getProjects() {
        return projects;
    }

    public String[] getSkills() {
        return this.skills;
    }

    public int getExperience() {
        return experience;
    }
}
