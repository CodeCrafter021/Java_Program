import java.util.Scanner;

public class MostExpensiveBook {
    static class Book {
        int id;
        String title;
        double price;

        Book(int id, String title, double price) {
            this.id = id;
            this.title = title;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter book id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            books[i] = new Book(id, title, price);
        }

        Book expensiveBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].price > expensiveBook.price) {
                expensiveBook = books[i];
            }
        }

        System.out.println("Most expensive book:");
        System.out.println("Book id: " + expensiveBook.id);
        System.out.println("Title: " + expensiveBook.title);
        System.out.println("Price: " + expensiveBook.price);
        scanner.close();
    }
}