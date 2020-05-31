package thred;

//Thread.sleep  can cause interrupted exception
public class Sleep {
    public static void main(String[] args) {
        SleepTest sleepTest = new SleepTest();
        sleepTest.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

class SleepTest extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}