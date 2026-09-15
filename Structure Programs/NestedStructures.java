import java.util.Scanner;

// Program showing nested classes (like nested structs in C)
// Student has a Date of Birth inside it
public class NestedStructures {
    
    // Inner class for Date (like nested struct in C)
    static class Date {
        int day;
        int month;
        int year;
    }
    
    // Student class with nested Date
    static class Student {
        String name;
        int roll;
        Date dob = new Date(); // Nested object
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        
        System.out.print("Enter student's name: ");
        s1.name = sc.nextLine();
        
        System.out.print("Enter roll number: ");
        s1.roll = sc.nextInt();
        
        System.out.print("Enter Date of Birth (DD MM YYYY, separated by spaces): ");
        s1.dob.day = sc.nextInt();
        s1.dob.month = sc.nextInt();
        s1.dob.year = sc.nextInt();
        
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll Number: " + s1.roll);
        System.out.printf("DOB: %02d/%02d/%04d%n", s1.dob.day, s1.dob.month, s1.dob.year);
    }
}
