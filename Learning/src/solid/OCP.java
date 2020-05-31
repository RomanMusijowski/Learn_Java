package solid;

public class OCP {
    public static void main(String[] args) {
        Car car = new Audi();
        workInTaxi(car);
        Car car2 = new BMW();
        workInTaxi(car2);
    }

    static void workInTaxi(Car car) {
        car.workInTaxi();
    }
}


//  main -> AUDI
//  main -> Car <- AUDI
//  use interfaces main doesn't have to know about class Audi

interface Car{
    void workInTaxi();
}

class BMW implements Car{

    void getPasager(){
        System.out.println(" get 1 passanger");
    }

    @Override
    public void workInTaxi() {
        getPasager();
    }
}

class Audi implements Car{

    void getPassangers() {
        System.out.println("get passangers");
    }

    @Override
    public void workInTaxi() {
        getPassangers();
    }
}
