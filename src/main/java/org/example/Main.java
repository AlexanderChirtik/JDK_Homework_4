package org.example;

public class Main {
    public static void main(String[] args) {
        ListEmployees list = new ListEmployees();
        list.searchByExperience(9);
        System.out.println();
        list.searchPhoneByName("Олег");
        System.out.println();
        list.searchByPersonnelNumber(22);

        Employee employee = new Employee(99, "89000001234", "Игнат", 0.1);
        System.out.println();
        list.addEmployee(employee);
    }
}