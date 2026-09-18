package MethodPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MethodExamples {
    private static void staticMethod() {
        System.out.println("Static method");
    }

    private void instanceMethod() {
        System.out.println("Instance method");
    }

    @Override
    public String toString() {
        return "MethodExamples object";
    }

    public static void main(String[] args) {
        staticMethod();
        new MethodExamples().instanceMethod();
        List<String> words = Arrays.asList("Java", "Methods");
        words.forEach(System.out::println);
        System.out.println(new MethodExamples());
        System.out.println("codePointAt: " + "Java".codePointAt(1));
        System.out.println("compare: " + "a".compareTo("b"));
        System.out.println("equals: " + "Java".equals("Java"));
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println("next: " + iterator.next());
        }
        Thread worker = new Thread(() -> System.out.println("run() method"));
        worker.start();
    }
}