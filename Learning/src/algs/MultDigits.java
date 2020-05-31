package algs;

import java.util.ArrayList;
import java.util.List;

public class MultDigits {
    public static void main(String[] args) {
        System.out.println(getDigits("4123134243"));
    }

    static String getDigits(String string) {
        int i = 0;
        char[] chars = string.toCharArray();
        String result = "";

        for (char aChar : chars) {
            int q = Integer.parseInt(String.valueOf(aChar));
            for (int i1 = 0; i1 < q; i1++) {
                result = result + q;
            }
        }
        return result;
    }
}
