package patterns.factory;

public class PC extends Computer {

    private String cpu;
    private String ssd;
    private String ram;

    public PC(String cpu, String ssd, String ram) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getSDD() {
        return this.ssd;
    }
}
