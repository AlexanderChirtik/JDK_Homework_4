package org.example;

public class Employee {

    private int personnelNumber;
    private String phoneNumber;
    private String name;
    private double experience;

    public Employee(int personnelNumber, String phoneNumber, String name, double experience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }


    @Override
    public String toString() {
        return "Номер работника: " + getPersonnelNumber() + ";  Номер телефона: " + getPhoneNumber() +
                ";  Имя: " + getName() + ";  Стаж: " + getExperience() + ";";
    }
}
