package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListEmployees {

    private List<Employee> listWorkers;
    public ListEmployees(){
        listWorkers = createList();
    }



    private List<Employee> createList(){
        List<Employee> allWorkers = new ArrayList<>();
        allWorkers.add(new Employee(22, "89000000001", "Никита", 1.2));
        allWorkers.add(new Employee(20, "89000000013", "Светлана", 0));
        allWorkers.add(new Employee(3, "89000000023", "Николай", 9));
        allWorkers.add(new Employee(108, "89000000002", "Олег", 11.1));
        allWorkers.add(new Employee(2, "89000000089", "Александр", 10));
        allWorkers.add(new Employee(11, "89000000126", "Олег", 3.3));
        allWorkers.add(new Employee(12, "89000000033", "Антонина", 25));
        return allWorkers;
    }
    private void printList(List<Employee> list){
        for (Employee employee:list){
            System.out.println(employee);
        }
    }


    /**
     *
     * @param experience Поиск будет проходить только по определенному стажу, а не в промежутке "от - до"
     * @return Так как список сотрудников заранее создан с уникальными показателями стажа,
     * возвращаться будет только 1 сотрудник
     */
    public void searchByExperience(double experience){
        List<Employee> listEmployees = new ArrayList<>();
        for (Employee employee:listWorkers) {
            if (employee.getExperience() == experience){
                listEmployees.add(employee);
            }
        }

        printList(listEmployees);
    }

    public void searchPhoneByName(String name){
        List<Employee> listPhones = new ArrayList<>();
        for (Employee employee:listWorkers) {
            if (employee.getName() == name){
                listPhones.add(employee);
            }
        }

        for (Employee employee:listPhones) {
            System.out.println(employee.getPhoneNumber());
        }
    }

    public void searchByPersonnelNumber(int personnelNumber){
        List<Employee> listEmployees = new ArrayList<>();
        for (Employee employee:listWorkers) {
            if (employee.getPersonnelNumber() == personnelNumber){
                listEmployees.add(employee);
            }
        }

        printList(listEmployees);
    }

    public void addEmployee(Employee employee){
        listWorkers.add(employee);
        System.out.println("Новый сотрудник добавлен\nСписок сотрудников");
        printList(listWorkers);
    }
}
