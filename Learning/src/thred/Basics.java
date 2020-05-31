package thred;

public class Basics {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ByExtend byExtend = new ByExtend();
        byExtend.start();

        ByImplement byImplement = new ByImplement();
        Thread thread = new Thread(byImplement);
        thread.start();


    }
}

class ByExtend extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class ByImplement implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
