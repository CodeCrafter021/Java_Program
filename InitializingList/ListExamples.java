package InitializingList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ravi", "Asha", "Ravi", null, "Mohan"));
        System.out.println("Initial list: " + names);
        System.out.println("Sublist: " + names.subList(0, 2));
        List<String> nonNull = names.stream().filter(name -> name != null).toList();
        System.out.println("Min and max: " + Collections.min(nonNull) + ", " + Collections.max(nonNull));
        int middle = names.size() / 2;
        System.out.println("Two halves: " + names.subList(0, middle) + " / " + names.subList(middle, names.size()));
        names.removeIf(java.util.Objects::isNull);
        names = new ArrayList<>(new java.util.LinkedHashSet<>(names));
        Collections.sort(names);
        System.out.println("Sorted unique list: " + names);
        System.out.println("First and last: " + names.get(0) + ", " + names.get(names.size() - 1));
        System.out.println("Comma separated: " + String.join(", ", names));
        LinkedList<String> linked = new LinkedList<>(names);
        linked.addFirst("First");
        linked.addLast("Last");
        System.out.println("LinkedList ends: " + linked);
        List<String> other = Arrays.asList("Asha", "Neha");
        linked.retainAll(other);
        System.out.println("Common elements: " + linked);
    }
}