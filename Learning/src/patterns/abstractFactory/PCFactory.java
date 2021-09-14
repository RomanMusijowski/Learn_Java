package patterns.abstractFactory;

public class PCFactory implements AbstractComputerFactory{

    private String cpu;
    private String ssd;
    private String ram;

    public PCFactory(String cpu, String ssd, String ram) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new PC(cpu,ssd,ram);
    }
}
