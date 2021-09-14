package patterns.abstractFactory;

public class ServerFactory implements AbstractComputerFactory {

    private String cpu;
    private String ssd;
    private String ram;

    public ServerFactory(String cpu, String ssd, String ram) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new Server(cpu, ssd, ram);
    }
}
