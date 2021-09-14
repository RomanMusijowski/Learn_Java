package patterns.interfaces;

public interface Start extends Finish{

    void repeat();

    String sayStart();

    default String sayStartDefault() {
        return "IT IS THE DEFAULT METHOD!";
    }
}
