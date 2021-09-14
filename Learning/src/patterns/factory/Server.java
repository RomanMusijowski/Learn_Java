package patterns.factory;

public class Server extends Computer {

    private String cpu;
    private String ssd;
    private String ram;

    public Server(String cpu, String ssd, String ram) {
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
