package Java.CollectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExamples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set = new HashSet<>(list);
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        Collection<Integer> collection = list;
        System.out.println("Collections: " + list + " / " + set + " / " + map);
        System.out.println("Size: " + collection.size() + ", contains 3: " + collection.contains(3));
        Collections.shuffle(list);
        Collections.reverse(list);
        Collections.replaceAll(list, 2, 20);
        Collections.rotate(list, 1);
        System.out.println("Updated list: " + list);
        System.out.println("Collection as array: " + Arrays.toString(collection.toArray()));
        System.out.println("Array as collection: " + Arrays.asList(5, 6, 7));
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}