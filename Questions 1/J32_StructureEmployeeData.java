import java.util.Scanner;

// Program to store and display details of 3 employees using a class (like C struct)
public class J32_StructureEmployeeData {

    static class Employee {
        int empID;
        String name;
        float salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];
        for (int i = 0; i < 3; i++) emp[i] = new Employee();

        System.out.println("--- Enter the details of 3 employees ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter Employee ID: "); emp[i].empID = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: "); emp[i].name = sc.nextLine();
            System.out.print("Enter Salary: "); emp[i].salary = sc.nextFloat();
        }

        System.out.println("\n====================================");
        System.out.println("          EMPLOYEE DETAILS          ");
        System.out.println("====================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Employee ID : " + emp[i].empID);
            System.out.println("Name        : " + emp[i].name);
            System.out.printf("Salary      : $%.2f%n", emp[i].salary);
            System.out.println("------------------------------------");
        }
    }
}
