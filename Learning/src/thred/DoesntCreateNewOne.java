package thred;

public class DoesntCreateNewOne {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        new NewThread().start();
        new NewThread().run();//dont create a new thread
    }
}

class NewThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        throw new RuntimeException();
    }
}
