package thred;


// we have to use only one type of syncchonisation
// when we add "synchronized" with static methods it makes lock on all class
// when we add  "synchronized" with non static method it makes lock on object
// those two locks are completely different and in this case two threads can work with the same resources

//!!!!!!!!!!!!!!be careful, dont use it

public class Sync_2 {
    public static void main(String[] args) throws InterruptedException {
        Resource2.i = 5;
        SyncStatic syncStatic = new SyncStatic();
        syncStatic.setName("one");
        SyncStatic syncStatic2 = new SyncStatic();

        syncStatic.start();
        syncStatic2.start();
        syncStatic.join();
        syncStatic2.join();

        System.out.println(Resource2.i);
    }
}

class SyncStatic extends Thread{
    Resource2 resource;

    @Override
    public void run() {
        Resource2.changeStaticI();
        new Resource2().changeI();
    }
}

class Resource2 {
    static int i;

    static void changeStaticI(){
        synchronized (Resource.class) {
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            int i = Resource2.i;
            i++;
            Resource2.i = i;
        }
    }

    void changeI() {
        synchronized (this) {
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            int i = Resource2.i;
            i++;
            Resource2.i = i;
        }
    }
}
