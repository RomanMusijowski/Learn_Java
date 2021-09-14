package patterns.abstractFactory;



public class FactoryComputer {

    public static Computer getComputer(AbstractComputerFactory factory){
        return factory.createComputer();
    }
}
