package thred;

public class Synchronize {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.setI(5);
        SynThread thread = new SynThread();
        thread.setName("one");
        thread.setResource(resource);

        SynThread thread2 = new SynThread();
        thread2.setResource(resource);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(resource.getI());
    }
}

class SynThread extends Thread{
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}

class Resource {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void changeI(){// or synchronized void changeI
        synchronized (this){
            int i = this.i;
            if (Thread.currentThread().getName().equals("one")){
                Thread.yield();
            }
            i++;
            this.i = i;
        }
    }
}
