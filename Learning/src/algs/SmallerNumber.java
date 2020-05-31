package algs;

import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {
        System.out.println(solve(874194));
    }

    static int solve(int number) {
        String digits = Integer.toString(number);
        int[] digitsInt = new int[digits.length()];
        for (int i = 0; i < digitsInt.length; i++) {
            digitsInt[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }

        if (digitsInt.length < 2) {
            return -1;
        } else {
            if (theSame(digitsInt) || smallerThan(digitsInt)) {
                return -1;
            }
            Arrays.sort(digitsInt);
            return getNumber(digitsInt);
        }
    }

    static boolean smallerThan(int[] small) {
        int j = small[0];
        for (int i : small) {
            if (j > i) return false;
            j = i;
        }
        return true;
    }

    static boolean theSame(int[] diff) {
        return Arrays.stream(diff).allMatch(s -> s == diff[0]);
    }

    static int getNumber(int[] ints) {
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            result *= 10;
            result += ints[i];
        }
        return result;
    }
}
