package patterns.interfaces;

public class Class extends TestAbstract {

    @Override
    public String sayStartDefault() {
        return "sayStartDefault() was redefine!";
    }

    @Override
    public String sayFinishDefault() {
        return "sayFinishDefault() was redefine!";
    }


    @Override
    String testAbstractWithImpl() {
        return "super.testAbstractWithImpl() was redefine";
    }

    @Override
    public void repeat() {
        sayStart();
        sayFinish();
    }

    @Override
    public String sayStart() {
        return "sayStart() {";
    }

    @Override
    public String sayFinish() {
        return "sayFinish()";
    }

    @Override
    boolean returnTrue() {
        return true;
    }
}
