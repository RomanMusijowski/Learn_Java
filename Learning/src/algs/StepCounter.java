package algs;

public class StepCounter {
    public static void main(String[] args) {

        String result = translate("safdgdgvdsdf", ".");
        System.out.println(translate("safdgdgvdsdf", "."));
        System.out.println(translate("safdgdgvdsdf", ".").equals("2.1.2.4.2.4.2.1.4.2.4.2"));
    }

    static String translate(String s, String sep) {
        char[] result = new char[s.length()*2];
        char[] chars = s.toCharArray();

        int j, p = 0;
        for (int i = 0; i < chars.length; i++) {
            j = 0;
            for (char check : chars) {
                if (chars[i] == check) {
                    j++;
                }
            }
            if (i == chars.length - 1) {
                result[p] = (char) (j + '0');
                break;
            }
            result[p] = (char) (j + '0'); result[p+1] = sep.charAt(0);
            p+=2;
        }
        return String.valueOf(result);
    }
}
