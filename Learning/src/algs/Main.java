package algs;

public class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(2, 4));
    }
}


class Calculator {
    public int add(int i, int y) {
        return i+y;
    }
    public int subtrac(int i, int y) {
        return i-y;
    }
    public int multiply(int i, int y) {
        return i*y;
    }
    public int divide(int i, int y) {
        if (y == 0){
            return 0;
        }
        return i/y;
    }
}
