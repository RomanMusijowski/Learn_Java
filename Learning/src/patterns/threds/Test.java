package patterns.threds;

public class Test extends Thread {

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i+"");
        }
    }
}
