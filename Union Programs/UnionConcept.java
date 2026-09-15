// In C, a union stores different data types in the SAME memory location.
// Java does NOT have unions. The closest we can do is use a class where
// only one field is used at a time, or use Object type.
// This program demonstrates the union concept using a Java class.

// C union behavior: all members share same memory, so changing one changes others.
// In Java, we simulate this using a class with separate fields.
public class UnionConcept {
    
    // Simulating C's union Data { int i; float f; }
    static class DataUnion {
        // In C, i and f share memory. In Java they are separate.
        int i;
        float f;
        
        // Java version note: unlike C, changing f here does NOT change i
        // because Java doesn't share memory between fields
    }
    
    // Simulating struct Vehicle with embedded union
    static class Vehicle {
        int type;
        int doors;       // For cars
        int propellers;  // For boats (in C union, these share memory)
    }
    
    public static void main(String[] args) {
        
        // Demo 1: Data union concept
        DataUnion data = new DataUnion();
        data.i = 10;
        System.out.println("data.i: " + data.i);
        
        data.f = 220.5f;
        System.out.println("data.f: " + data.f);
        // Note: In C, data.i would be corrupted here because they share memory.
        // In Java, data.i is still 10 because each field has its own memory.
        System.out.println("data.i after assigning f (in Java still intact): " + data.i);
        
        System.out.println("\n--- Vehicle Demo ---");
        
        // Car
        Vehicle car = new Vehicle();
        car.type = 1;
        car.doors = 4;
        System.out.println("Vehicle Type: " + car.type);
        System.out.println("Number of Doors: " + car.doors);
        
        // Boat
        Vehicle boat = new Vehicle();
        boat.type = 2;
        boat.propellers = 2;
        System.out.println("\nVehicle Type: " + boat.type);
        System.out.println("Number of Propellers: " + boat.propellers);
        
        System.out.println("\n--- Size Comparison (like C's sizeof) ---");
        // In Java we can't get field sizes like C, but we can show class sizes roughly
        System.out.println("In C: union size = size of its LARGEST member");
        System.out.println("In C: struct size = sum of all members");
        System.out.println("In Java: all objects are on the heap with full separate fields");
    }
}
