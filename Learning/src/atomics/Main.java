package atomics;

public class Main {
    public static void main(String[] args) {

        AtomicInt atomic = new AtomicInt();


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                atomic.incrementUnsafe();
                System.out.println("Atomic incremented to " + atomic.getInteger() + ", by thread: " + Thread.currentThread());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                atomic.incrementUnsafe();
                System.out.println("Atomic incremented to " + atomic.getInteger() + ", by thread: " + Thread.currentThread());
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                atomic.incrementUnsafe();
                System.out.println("Atomic incremented to " + atomic.getInteger() + ", by thread: " + Thread.currentThread());
            }
        });

        thread1.setName("name1");
        thread2.setName("name2");
        thread3.setName("name3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
