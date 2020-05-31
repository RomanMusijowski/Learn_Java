package thred;

//Yield change a thread status from running to Runnable
//and give space for another thread but previous thread can run at any moment


//Join will execute second thread and only when one'll change status to dead
//current thread will continue his execution
public class Yield {
    public static void main(String[] args) {
        YieldThread yieldThread = new YieldThread();
        yieldThread.start();
//        Thread.yield();
        try {
            yieldThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread ");
    }
}

class YieldThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("second thread");
    }
}
