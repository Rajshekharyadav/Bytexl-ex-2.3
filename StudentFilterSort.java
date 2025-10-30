import java.util.*;
import java.util.stream.*;

class Student {
    int roll;
    String name;
    double marks;

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return roll + " " + name + " " + marks;
    }
}

public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Arjun", 80),
            new Student(2, "Megha", 92),
            new Student(3, "Sunny", 68)
        );

        // Filter marks > 70, sort by marks
        students.stream()
            .filter(s -> s.marks > 70)
            .sorted(Comparator.comparingDouble(s -> s.marks))
            .forEach(System.out::println);
    }
}
