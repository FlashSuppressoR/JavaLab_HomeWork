package Lesson3.Task6;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Lesson3.Task6.Task6.*;
import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void calcNumberOfEmployeesTest() {
        Department dep1 = new Department("dep-1", "111-1", employeesList1);
        Department dep2 = new Department("dep-2", "222-1", employeesList2);
        departments.add(dep1);
        departments.add(dep2);
        //dep 111
        Employees employees1 = new Employees("Johnny", 15000);
        Employees employees2 = new Employees("Alex", 12000);
        Employees employees3 = new Employees("Toby", 23000);
        employeesList1.add(employees1);
        employeesList1.add(employees2);
        employeesList1.add(employees3);
        //dep 222
        Employees employees4 = new Employees("Bill", 15000);
        Employees employees5 = new Employees("Torry", 19999);
        Employees employees6 = new Employees("James", 23000);
        employeesList2.add(employees4);
        employeesList2.add(employees5);
        employeesList2.add(employees6);

        long produceResult = calcNumberOfEmployees(departments, threshold);
        long actualResult = 1;

        Assertions.assertEquals(produceResult, actualResult);
    }
}