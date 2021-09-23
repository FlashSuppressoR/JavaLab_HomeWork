package Lesson3.Task6;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Lesson3.Task6.Task6.*;

public class Task6Test {

    @Test
    public void calcNumberOfEmployeesTest() {
        Department dep1 = new Department("dep-1", "111-1", firstEmployeeList);
        Department dep2 = new Department("dep-2", "222-1", secondEmployeeList);
        departments.add(dep1);
        departments.add(dep2);
        //dep 111
        Employee employee1 = new Employee("Johnny", 15000);
        Employee employee2 = new Employee("Alex", 12000);
        Employee employee3 = new Employee("Toby", 23000);
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        //dep 222
        Employee employee4 = new Employee("Bill", 15000);
        Employee employee5 = new Employee("Torry", 19999);
        Employee employee6 = new Employee("James", 23000);
        secondEmployeeList.add(employee4);
        secondEmployeeList.add(employee5);
        secondEmployeeList.add(employee6);

        long produceResult = calcNumberOfEmployees(departments, THRESHOLD);
        long actualResult = 1;

        Assertions.assertEquals(produceResult, actualResult);
    }
}