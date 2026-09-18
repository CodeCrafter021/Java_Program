import java.util.Scanner;

public class StudentHighestMarks {
    static class Student {
        String name;
        double marks;

        Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(name, marks);
        }

        Student highest = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > highest.marks) {
                highest = students[i];
            }
        }

        System.out.println("Student with highest marks: " + highest.name);
        System.out.println("Marks: " + highest.marks);
        scanner.close();
    }
}