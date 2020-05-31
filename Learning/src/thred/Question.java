package thred;

public class Question implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Question());
        thread.start();

        new Thread(new Question()).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name - "
                    + Thread.currentThread().getName()
            + " count " + i);
        }
    }
}
