package Lesson3.Task6;

import java.util.ArrayList;
import java.util.List;

/**
 * You have two classes: Employee (name: String, salary: Long) and
 * Department (name: String, code: String, employees: List<Employee>).
 * Both classes have getters for all fields with the corresponding names (getName(), getSalary(), getEmployees() and so on).
 * <p>
 * Write a method using Stream API that calculates the general number of employees with
 * salary >= threshold for all departments whose code starts with string "111-" (without "").
 * Perhaps, flatMap method can help you to implement it.
 * <p>
 * Classes Employee and Department will be available during testing.
 * You can define your own classes for local testing.
 * <p>
 * Important. Use the given template for your method.
 * Pay attention to type of argument and the returned value. Please, use only Stream API, no cycles.
 * <p>
 * Examples: there are 2 departments (in JSON notation) below and threshold = 20 000.
 * The result is 1 (because there is only one suitable employee).
 * <p>
 * [
 * {
 * "name": "dep-1",
 * "code": "111-1",
 * "employees": [
 * {
 * "name": "William",
 * "salary": 20000
 * },
 * {
 * "name": "Sophia",
 * "salary": 10000
 * }
 * ]
 * },
 * {
 * "name": "dep-2",
 * "code": "222-1",
 * "employees": [
 * {
 * "name": "John",
 * "salary": 50000
 * }
 * ]
 * }
 * ]
 */

public class Task6 {
    static List<Department> departments = new ArrayList<>();
    static List<Employees> employeesList1 = new ArrayList<>();
    static List<Employees> employeesList2 = new ArrayList<>();
    final static String regDep = "111-";
    final static int threshold = 20000;

    public static void main(String[] args) {
        createDep();
        initDep();

        System.out.println("Suitable employees: " + calcNumberOfEmployees(departments, threshold));
    }

    public static void createDep() {
        Department dep1 = new Department("dep-1", "111-1", employeesList1);
        Department dep2 = new Department("dep-2", "222-1", employeesList2);
        departments.add(dep1);
        departments.add(dep2);
    }

    public static void initDep() {
        //dep-1
        Employees employees1 = new Employees("Johnny", 15000);
        Employees employees2 = new Employees("Alex", 12000);
        Employees employees3 = new Employees("Toby", 23000);
        Employees employees4 = new Employees("Bred", 22000);
        Employees employees5 = new Employees("Bob", 25000);
        //dep-2
        Employees employees6 = new Employees("Bill", 15000);
        Employees employees7 = new Employees("Torry", 19999);
        Employees employees8 = new Employees("James", 23000);
        Employees employees9 = new Employees("Wayne", 19000);

        employeesList1.add(employees1);
        employeesList1.add(employees2);
        employeesList1.add(employees3);
        employeesList1.add(employees4);
        employeesList1.add(employees5);
        employeesList2.add(employees6);
        employeesList2.add(employees7);
        employeesList2.add(employees8);
        employeesList2.add(employees9);
    }

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        long calc = departments.stream()
                .filter(s -> s.getCode().contains(regDep))
                .flatMap(department -> department.getEmployees()
                        .stream().filter(employees -> employees.getSalary() >= threshold)).count();
        // Cтоит ли ретёрнить инициализацию переменной, а не создавать переменную и ретёрнить её, как советует ИДЕ?
        return calc;
    }
}
