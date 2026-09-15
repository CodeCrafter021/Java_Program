// Program demonstrating the concept of Union in Java
// Java does not have unions, but we can show the concept using a class
// In C, a union member shares memory - only one field holds valid data at a time
public class J33_UnionDemo {

    // Simulating union Data { int i; float f; char str[20]; }
    static class DataUnion {
        int i;
        float f;
        String str;
    }

    public static void main(String[] args) {
        DataUnion data = new DataUnion();

        System.out.println("--- Concept of Union ---");
        System.out.println("In C: union size = size of largest member (shared memory)");
        System.out.println("In Java: all fields have separate memory (no true union)\n");

        // Correct usage: one at a time
        System.out.println("--- Correct Usage (One at a time) ---");
        data.i = 10;
        System.out.println("data.i : " + data.i);

        data.f = 220.5f;
        System.out.printf("data.f : %.1f%n", data.f);

        data.str = "Hello World";
        System.out.println("data.str : " + data.str);

        System.out.println("\n--- Note: In C, all 3 assigned at once would corrupt values ---");
        System.out.println("--- In Java each field is independent, no corruption happens ---");
    }
}
