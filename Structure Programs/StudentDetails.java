import java.util.Scanner;

// Program to store and display student details for 3 students
public class StudentDetails {
    
    // Student class (like struct in C)
    static class Student {
        String name;
        int roll;
        float marks;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        
        // Initialize each student object
        for (int i = 0; i < 3; i++) {
            s[i] = new Student();
        }
        
        // Take input for all 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Student " + (i + 1) + " Name, Roll Number, Marks:");
            s[i].name = sc.next();
            s[i].roll = sc.nextInt();
            s[i].marks = sc.nextFloat();
        }
        
        // Display all students
        System.out.println("\n--- Class Info ---");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Roll: %d | Name: %s | Marks: %.2f%n",
                s[i].roll, s[i].name, s[i].marks);
        }
    }
}
