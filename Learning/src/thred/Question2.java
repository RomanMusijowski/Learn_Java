package thred;

public class Question2 extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Question2 question2 = new Question2();
        question2.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
