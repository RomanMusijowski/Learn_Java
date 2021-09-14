package patterns.interfaces;

public interface Finish {
    String sayFinish();

    default String sayFinishDefault(){
        return "sayFinishDefault() works!";
    }
}
