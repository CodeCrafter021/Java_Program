// Program demonstrating the concept of pointers in Java
// Java does NOT have pointers like C, but references work similarly
// In Java, objects are accessed via references (which behave like pointers)
public class J34_PointerConcept {

    // Wrapper class to simulate pointer behavior (mutable int)
    static class IntRef {
        int value;
        IntRef(int value) { this.value = value; }
    }

    public static void main(String[] args) {
        // In C: int num = 10; int *pNum = &num;
        // In Java: we use an object reference
        IntRef num = new IntRef(10);

        System.out.println("Original Value of num => " + num.value);

        // Modify through reference (like *pNum = 25 in C)
        num.value = 25;

        System.out.println("Modified value of num => " + num.value);
        System.out.println("\nNote: Java references work like C pointers,");
        System.out.println("but Java does not allow direct memory address access.");
    }
}
