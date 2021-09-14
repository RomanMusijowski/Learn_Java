package patterns.interfaces;

public class Main {
    public static void main(String[] args) {
        TestAbstract test = new Class();
        System.out.println(test.sayStart());
        System.out.println(test.sayFinish());
        System.out.println();

        System.out.println(test.sayStartDefault());
        System.out.println(test.sayFinishDefault());

        System.out.println(test.testAbstractWithImpl());
    }
}
