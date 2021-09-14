package patterns.hash;

import java.util.HashMap;
import java.util.Map;

public class HashingTest {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        System.out.println("dk.hashCode() = " + dk.hashCode());

        Integer value = hm.get(dk);

        System.out.println("value = " + value);

    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        System.out.println("getAllData dk.hashCode() = " + dk.hashCode());

        hm.put(dk, 10);

        return hm;
    }

}