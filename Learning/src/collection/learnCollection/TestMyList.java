package collection.learnCollection;

import java.util.ArrayList;
import java.util.List;

public class TestMyList {
    public static void main(String[] args) {
//        MyArrayList<String> strings = new MyArrayList();
//        strings.add("1");
//        strings.add("2");
//        strings.add("3");
//
//
//        System.out.println(strings.toString());

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        check(stringList);
        check(null);
        check(new ArrayList<>());
    }

    static void check(List<String> strings) {
        if (strings != null && !strings.isEmpty()) {
            System.out.println("not empty");
        }
    }
}
