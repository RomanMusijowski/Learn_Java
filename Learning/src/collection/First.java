package collection;

import java.util.*;

public class First {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Map<String, String> map = new HashMap<>();

        //collection
        collection.add("one");
        collection.add("two");
        System.out.println(collection.size());
        collection.remove("one");
        System.out.println(collection.size());
        System.out.println(collection.contains("two"));
        System.out.println(collection.contains("one"));
        System.out.println();

        //
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list.toString());
        System.out.println(list.remove(0));
        System.out.println(list.remove("two"));
        System.out.println(list.indexOf("three"));

        //set
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();

        //queue
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        System.out.println(queue.size());
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll()); //return and remove, return null if there is no value
        System.out.println(queue.remove());//return and remove, throws exception if there is no value
        System.out.println();

        //map
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        System.out.println(map.size());
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue("three"));
        System.out.println(map.values());
        System.out.println(map.get("one"));
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }
        System.out.println();

    }
}
