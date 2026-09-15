package ArrayPrograms.Operations;
import java.util.Scanner;

public class ArrayOperations {
    
    static int[] arr = new int[100]; // Array with max 100 elements
    static int size = 0;             // Current number of elements
    static Scanner sc = new Scanner(System.in);
    
    // Create array - take elements from user
    static void createArray() {
        System.out.print("Enter required size of array (Max 100): ");
        size = sc.nextInt();
        
        if (size > 100 || size <= 0) {
            System.out.println("Invalid size!");
            size = 0;
            return;
        }
        
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array created successfully!");
    }
    
    // Insert element at a given position
    static void insertElement() {
        if (size >= 100) {
            System.out.println("Array is full! Cannot insert.");
            return;
        }
        System.out.print("Enter position (1 to " + (size + 1) + ") and value: ");
        int pos = sc.nextInt();
        int val = sc.nextInt();
        
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position!");
            return;
        }
        
        // Shift elements to the right to make space
        for (int i = size; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = val;
        size++;
        System.out.println("Element inserted successfully!");
    }
    
    // Delete element at a given position
    static void deleteElement() {
        if (size == 0) {
            System.out.println("Array is empty! Nothing to delete.");
            return;
        }
        System.out.print("Enter position to delete (1 to " + size + "): ");
        int pos = sc.nextInt();
        
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }
        
        // Shift elements left to fill the gap
        for (int i = pos - 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Element deleted successfully!");
    }
    
    // Update element at a given position
    static void updateElement() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.print("Enter position to update (1 to " + size + ") and new value: ");
        int pos = sc.nextInt();
        int val = sc.nextInt();
        
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }
        
        arr[pos - 1] = val;
        System.out.println("Element updated successfully!");
    }
    
    // Display array from first to last (forward)
    static void traverseForward() {
        if (size == 0) { System.out.println("Array is empty!"); return; }
        System.out.print("Array (Forward) => ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Display array from last to first (backward)
    static void traverseBackward() {
        if (size == 0) { System.out.println("Array is empty!"); return; }
        System.out.print("Array (Backward) => ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Linear Search - check each element one by one
    static void linearSearch() {
        if (size == 0) { System.out.println("Array is empty!"); return; }
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        boolean found = false;
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at position " + (i + 1) + " (index " + i + ").");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Element not found.");
    }
    
    // Binary Search - works only on sorted array
    static void binarySearch() {
        if (size == 0) { System.out.println("Array is empty!"); return; }
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        int left = 0, right = size - 1;
        boolean found = false;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                System.out.println("Element " + key + " found at position " + (mid + 1) + " (index " + mid + ").");
                found = true;
                break;
            }
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        if (!found) System.out.println("Element not found! (Make sure array is sorted in Ascending order).");
    }
    
    // Sort array in ascending order using bubble sort
    static void sortAscending() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted in Ascending order!");
    }
    
    // Sort array in descending order using bubble sort
    static void sortDescending() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted in Descending order!");
    }
    
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n1. Create Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Update Element");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Backward");
            System.out.println("7. Linear Search");
            System.out.println("8. Binary Search (Requires sorted array)");
            System.out.println("9. Sort Ascending");
            System.out.println("10. Sort Descending");
            System.out.println("11. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: createArray(); break;
                case 2: insertElement(); break;
                case 3: deleteElement(); break;
                case 4: updateElement(); break;
                case 5: traverseForward(); break;
                case 6: traverseBackward(); break;
                case 7: linearSearch(); break;
                case 8: binarySearch(); break;
                case 9: sortAscending(); break;
                case 10: sortDescending(); break;
                case 11:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
