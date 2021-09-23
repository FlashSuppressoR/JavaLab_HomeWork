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
    static List<Employee> firstEmployeeList = new ArrayList<>();
    static List<Employee> secondEmployeeList = new ArrayList<>();
    final static String REG_DEP = "111-";
    final static int THRESHOLD = 20000;

    public static void main(String[] args) {
        createDep();
        initDep();

        System.out.println("Suitable employees: " + calcNumberOfEmployees(departments, THRESHOLD));
    }

    public static void createDep() {
        Department dep1 = new Department("dep-1", "111-1", firstEmployeeList);
        Department dep2 = new Department("dep-2", "222-1", secondEmployeeList);
        departments.add(dep1);
        departments.add(dep2);
    }

    public static void initDep() {
        //dep-1
        Employee employee1 = new Employee("Johnny", 15000);
        Employee employee2 = new Employee("Alex", 12000);
        Employee employee3 = new Employee("Toby", 23000);
        Employee employee4 = new Employee("Bred", 22000);
        Employee employee5 = new Employee("Bob", 25000);
        //dep-2
        Employee employee6 = new Employee("Bill", 15000);
        Employee employee7 = new Employee("Torry", 19999);
        Employee employee8 = new Employee("James", 23000);
        Employee employee9 = new Employee("Wayne", 19000);

        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        firstEmployeeList.add(employee4);
        firstEmployeeList.add(employee5);
        secondEmployeeList.add(employee6);
        secondEmployeeList.add(employee7);
        secondEmployeeList.add(employee8);
        secondEmployeeList.add(employee9);
    }

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {

        return departments.stream()
                .filter(s -> s.getCode().contains(REG_DEP))
                .flatMap(department -> department.getEmployees()
                        .stream().filter(employee -> employee.getSalary() >= threshold)).count();
    }
}
