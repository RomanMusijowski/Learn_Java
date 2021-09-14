package collection.learnCollection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> test = new HashMap<>();
        test.put(1, "first");
        test.put(2, "second");
        test.put(3, "third");
        test.put(null, "testnull");
        test.put(4, "fourth");
        test.put(5, null);
//        for (Map.Entry<Integer, String> entry : test.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
//        }
        if (test != null) {
            test.forEach((a, b) ->
                    System.out.println("Key: " + a + ", value: " + b));
        }
    }
}
