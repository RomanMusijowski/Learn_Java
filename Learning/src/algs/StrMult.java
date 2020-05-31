package algs;

import java.util.ArrayList;
import java.util.List;

public class StrMult {
    public static void main(String[] args) {
        System.out.println(solve(1425253423));
    }

    static int solve(int number) {
        char[] chars;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        do {
            list.clear();
            chars =  String.valueOf(number).toCharArray();
            number=1;

            for (char aChar : chars) {
                list.add(Character.getNumericValue(aChar));
            }
            for (Integer integer : list) {
                number *= integer;
            }
            count++;

            if (number > 9) {
                continue;
            }else {
                break;
            }
        }while (true);
        return count;
    }
}
