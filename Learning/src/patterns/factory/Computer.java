package patterns.factory;

public abstract class Computer extends patterns.abstractFactory.Computer {

    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getSDD();

    @Override
    public String toString() {
        return "RAM= "+this.getRAM()+", HDD="+this.getSDD()+", CPU="+this.getCPU();
    }
}
