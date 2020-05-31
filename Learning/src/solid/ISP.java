package solid;

public class ISP {
    public static void main(String[] args) {
        IEater empl = new Waiterr();
        empl.eat();
        Empl worker = new RealEmplCook();
        worker.deliver();
        worker.eat();

    }
}

//you don't have to use interfaces functions of what you dont use
// if you use them, just divide them on smaller pieces, like Empk interface

interface IEater{
    void eat();
}

interface IDriver{
    void deliver();
}

interface Empl extends IEater, IDriver{

}

class RealEmplCook implements Empl{

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void deliver() {
        System.out.println("deliver");
    }
}

class Waiterr implements IEater{


    @Override
    public void eat() {
        System.out.println("eat");
    }
}
