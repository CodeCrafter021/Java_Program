package Java.Miscellaneous;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;

public class MiscellaneousExamples {
    public static void main(String[] args) throws Exception {
        int first = 0, second = 1;
        for (int index = 0; index < 8; index++) {
            System.out.print(first + (index == 7 ? "\n" : " "));
            int next = first + second;
            first = second;
            second = next;
        }
        LinkedList<String> linked = new LinkedList<>(List.of("A", "B"));
        System.out.println("LinkedList array: " + Arrays.toString(linked.toArray()));
        Vector<String> vector = new Vector<>(List.of("X", "Y"));
        System.out.println("Vector list: " + new LinkedList<>(vector));
        System.out.println("Characters: " + Arrays.asList("Java".split("")));
        Iterator<String> iterator = vector.iterator();
        List<String> iteratorList = new LinkedList<>();
        iterator.forEachRemaining(iteratorList::add);
        System.out.println("Iterator list: " + iteratorList);
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        System.out.println("Map: " + map + ", stream: " + linked.stream().collect(Collectors.toList()));
        Set<String> set = new LinkedHashSet<>(linked);
        System.out.println("Set: " + set + ", array: " + Arrays.toString(set.toArray(new String[0])));
        InputStream input = new ByteArrayInputStream("input stream".getBytes(StandardCharsets.UTF_8));
        System.out.println("InputStream: " + new String(input.readAllBytes(), StandardCharsets.UTF_8));
        System.out.println("String object: " + (Object) "Java" + ", byte: " + Byte.parseByte("12"));
    }
}