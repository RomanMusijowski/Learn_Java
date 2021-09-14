package patterns.threds;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread(0);
        myThread.start();
//        myThread.join();
//        Thread.yield();
        myThread.wait();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from main");
        }
    }
}


class MyThread extends Thread{

    private int a;

    public MyThread(int a){
        this.a = a;
    }

    @Override
    public void run() {
        for (int i =0;i<1000;i++){
            try {
                Thread.sleep(300);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("hello from thread "+this.a);
        }
    }
}
