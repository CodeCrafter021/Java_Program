package ClassesAndObjectsPrograms;

interface Printable {
    void print();
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape implements Printable {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Circle area: " + area());
    }
}

public class OopExamples {
    private static OopExamples instance;
    private String name;

    private OopExamples() {
    }

    public static OopExamples getInstance() {
        if (instance == null) {
            instance = new OopExamples();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Object name: " + name);
    }

    static int add(int first, int second) {
        return first + second;
    }

    static double add(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        OopExamples.getInstance().setName("Encapsulated object");
        OopExamples.getInstance().show();
        System.out.println("Overloading: " + add(2, 3) + ", " + add(2.5, 3.5));
        Printable printable = new Circle(4);
        printable.print();
        Shape shape = new Circle(2);
        System.out.println("Polymorphism area: " + shape.area());
    }
}