package patterns.factory;

public class FactoryComputer {

    public static Computer getComputer(String type ,String ram, String ssd, String cpu){
        if ("PC".equalsIgnoreCase(type)) return new PC(cpu, ssd, ram);

        else if ("Server".equalsIgnoreCase(type)) return new Server(cpu, ssd, ram);

        return null;
    }
}
