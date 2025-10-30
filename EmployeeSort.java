import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice", 50000),
            new Employee(102, "Bob", 45000),
            new Employee(103, "Charlie", 60000)
        );

        // Sort by name using lambda
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        employees.forEach(System.out::println);
    }
}
