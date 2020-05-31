package solid;

public class SID {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.getSalary();
        em.doJob();
    }
}

interface IWorker{
    void getSalary();
}

class Employee implements IWorker {

    @Override
    public void getSalary() {
        System.out.println("get salary");
    }
    void doJob(){
        System.out.println("do job");
    }
}

class Waiter implements IWorker{

    @Override
    public void getSalary() {
        System.out.println("get salary");
    }

    void delivery(){}
}


