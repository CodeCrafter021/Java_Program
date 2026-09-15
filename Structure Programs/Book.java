import java.util.Scanner;

// In Java, we use classes instead of C structs
// This program stores and displays book details
public class Book {
    
    // These are like struct members in C
    String title;
    String author;
    float price;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create a Book object (like creating a struct variable in C)
        Book myBook = new Book();
        
        System.out.print("Enter book title: ");
        myBook.title = sc.nextLine();
        
        System.out.print("Enter author name: ");
        myBook.author = sc.nextLine();
        
        System.out.print("Enter book price: ");
        myBook.price = sc.nextFloat();
        
        // Display book details
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.printf("Price: $%.2f%n", myBook.price);
    }
}
