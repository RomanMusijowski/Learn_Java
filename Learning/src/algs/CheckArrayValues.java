package algs;

import java.util.Arrays;

public class CheckArrayValues {
    public static void main(String[] args) {
        String[] one = new String[10];
        String[] two = new String[10];
        String[] error = null;
        String[] empty = new String[10];


        for (int i = 0; i < one.length; i++) {
            one[i] = String.valueOf(i);
            two[i] = String.valueOf(i);
        }
        one[0] = null;
        two[8] = null;
        System.out.println(isInBoth(null, one, two));
    }

    public static boolean isInBoth(String value, String[] arrayA, String[] arrayB) {
        if (arrayA == null || arrayB == null) {
            return false;
        }
        return Arrays.asList(arrayA).contains(value) && Arrays.asList(arrayB).contains(value);
    }
}
