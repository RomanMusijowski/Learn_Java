package patterns.abstractFactory;

public class Main {

    public static void main(String[] args) {
        testFactory();
    }

    private static void testFactory() {
        Computer pc = FactoryComputer.getComputer(new PCFactory("2,5", "250", "16"));
        Computer server = FactoryComputer.getComputer(new ServerFactory("3,5", "500", "32"));

        System.out.println("ps="+pc.toString());
        System.out.println("server="+server.toString());
    }
}
