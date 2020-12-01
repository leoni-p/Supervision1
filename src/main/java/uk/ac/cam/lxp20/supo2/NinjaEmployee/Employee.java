package uk.ac.cam.lxp20.supo2.NinjaEmployee;

public class Employee {
    private final String name;
    int salary;

    Employee(String name) {
        this.name = name;
        salary = 0;
    }

    String getName () {
        return name;
    }

    int getSalary() {
        return salary;
    }

    void doEmployeeThings () {
        System.out.println("I'm an employee");
        salary ++;
    }
}
