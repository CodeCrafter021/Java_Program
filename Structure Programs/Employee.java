import java.util.Scanner;

// Program to store and display details of 3 employees
// Java class is used instead of C struct
public class Employee {
    int id;
    String name;
    float salary;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create array of 3 Employee objects (like array of structs in C)
        Employee[] emp = new Employee[3];
        for (int i = 0; i < 3; i++) {
            emp[i] = new Employee(); // Initialize each object
        }
        
        System.out.println("Enter details for 3 employees:");
        for (int i = 0; i < 3; i++) {
            System.out.print("\nEmployee " + (i + 1) + " ID: ");
            emp[i].id = sc.nextInt();
            sc.nextLine(); // Clear newline character
            
            System.out.print("Employee " + (i + 1) + " Name: ");
            emp[i].name = sc.nextLine();
            
            System.out.print("Employee " + (i + 1) + " Salary: ");
            emp[i].salary = sc.nextFloat();
        }
        
        // Display all employee records
        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < 3; i++) {
            System.out.printf("ID: %d | Name: %s | Salary: $%.2f%n",
                emp[i].id, emp[i].name, emp[i].salary);
        }
    }
}
