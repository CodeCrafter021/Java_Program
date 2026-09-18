import java.util.Scanner;

public class StudentAverageMarks {
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
        double totalMarks = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(name, marks);
            totalMarks += marks;
        }

        double averageMarks = totalMarks / students.length;
        System.out.println("Average marks: " + averageMarks);
        scanner.close();
    }
}