package patterns.builder;

public class Computer {

    private String cpu;
    private String ssd;
    private String ram;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.ram = computerBuilder.ram;
        this.ssd = computerBuilder.ssd;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public String getCpu() {
        return cpu;
    }

    public String getSsd() {
        return ssd;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ssd='" + ssd + '\'' +
                ", ram='" + ram + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder{

        private String cpu;
        private String ssd;
        private String ram;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String cpu, String ssd, String ram) {
            this.cpu = cpu;
            this.ssd = ssd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
