package patterns.adapter;

public class Socker {

    public Volt getVolt(){
        return new Volt(120);
    }
}
