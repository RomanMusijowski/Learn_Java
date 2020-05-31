package algs;

public class KebabCaseConverter {
    public static void main(String[] args) {
        System.out.println(solve("s436omeCa634melC643aseName643"));
    }

    static String solve(String phrase) {
        String str = phrase.replaceAll("[^A-Za-z]", "");
        String str2 = str.replaceAll("([A-Z])", "-$1").toLowerCase();
        return str2;
    }
}
