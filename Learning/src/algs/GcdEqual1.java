package algs;

public class GcdEqual1 {
    public static void main(String[] args) {
        System.out.println(solve(15));
    }


    static int solve(int d) {
        int ilosc = 0;
        for (int i = 1; i < d; i++) {
            if (gcd(i, d) == 1) {
                ilosc ++;
            }
        }
        return ilosc;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
}
