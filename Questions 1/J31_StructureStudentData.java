import java.util.Scanner;

// Program to store and display details of 5 students using a class (like C struct)
public class J31_StructureStudentData {

    static class Student {
        int rollNo;
        String name;
        float marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        for (int i = 0; i < 5; i++) s[i] = new Student();

        System.out.println("--- Enter the details of 5 students ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter Roll Number: "); s[i].rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: "); s[i].name = sc.nextLine();
            System.out.print("Enter Marks: "); s[i].marks = sc.nextFloat();
        }

        System.out.println("\nSTUDENT DETAILS");
        for (int i = 0; i < 5; i++) {
            System.out.println("Roll Number : " + s[i].rollNo);
            System.out.println("Name        : " + s[i].name);
            System.out.printf("Marks       : %.2f%n", s[i].marks);
        }
    }
}
