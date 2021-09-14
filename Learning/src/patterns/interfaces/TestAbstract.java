package patterns.interfaces;

public abstract class TestAbstract implements Start{

    abstract boolean returnTrue();

    String testAbstractWithImpl(){
        return "testAbstractWithImpl() the base method works;";
    }

}
