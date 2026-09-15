import java.util.Scanner;

// Program to calculate birth year based on current age
public class BirthYear {
    
    // Method that asks user for age and returns birth year
    static int getBirthYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current age: ");
        int age = sc.nextInt();
        return 2026 - age; // Subtract age from current year
    }
    
    public static void main(String[] args) {
        int birthYear = getBirthYear();
        System.out.println("You were born in approximately " + birthYear + ".");
    }
}
