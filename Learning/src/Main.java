
public class Main implements Runnable {
    public static void main(String[] args) {
        System.out.println("Egjkdlg;dfg");
        Main m = new Main();
        Thread t = new Thread(m);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("special");
    }
}
