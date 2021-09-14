package patterns.factory;

class FactoryComputerTest {

    public static void main(String[] args) {
        Computer pc = FactoryComputer.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = FactoryComputer.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }

}