package operators;

public class Operators {
    public static void main(String[] args) {
        int x = 6; // 1 1 0
        System.out.println(x << 2); //1 1 0 0 0 =24
        System.out.println(x << 3); //1 1 0 0 0 0=48

        int y = 6; // 1 1 0
        System.out.println(y >> 2); //1 = 1
        System.out.println(y >> 4); //1 = 0
        System.out.println(y >> 1); //1 = 0
    }
}
