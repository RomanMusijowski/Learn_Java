package collection.mapLearns;

import java.util.TreeMap;

public class TreeSetLearn {
    public static void main(String[] args) {
        //navigable map
        //have methods like tailMap, headMap, subMap
        TreeMap<String, String> stringMap = new TreeMap<>();
        stringMap.put("1", "o");
        stringMap.put("2", "t");
        stringMap.put("3", "th");
        stringMap.put("4", "f");
        stringMap.put("5", "fie");
        System.out.println(stringMap.subMap("1", "3").lastKey());
        System.out.println(stringMap.subMap("1", "3").firstKey());

        System.out.println(stringMap.headMap("3").firstKey());
        System.out.println(stringMap.tailMap("3").lastKey());
    }
}
