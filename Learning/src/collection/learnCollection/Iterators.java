package collection.learnCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Iterators {

    public static void main(String[] args) {
        failSafe();
//        failFast();
    }

    private static void failSafe() {
        //THIS COLLECTION DOESN'T SUPPORT ITER.REMOVE() OPERATION!!!!!!! CREATE A COPY
//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 2, 3, 4, 5, 6, 7});
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//            if (next.equals(3)) {
//                list.add(88);
//            }
//
//        }


//        IT DOESN'T CREATE A COPY !!!!!!
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + ", " + value);

            map.put("SEVEN", 7);
//            iterator.remove();
        }
        System.out.println(map);

    }

    private static void failFast() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
            if (next == 3) {
                // will throw Exception on
                // next call of next() method
//                al.remove(1);
            }
            iterator.remove();
        }
    }
}
