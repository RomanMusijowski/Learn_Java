package solid;

public class DIP {
    public static void main(String[] args) {
        Client client = new Client();
        client.doJob();
    }
}

//invertion of control
//make a middle part level between client and data access or so on.
//client doesn't have to know about data access & data access doesn't have to know about clien

interface DAO{
    void execute();
}

class DataAccess implements DAO{

    @Override
    public void execute() {
        System.out.println("data access execute");
    }
}

class Client {
    DAO dao = new DataAccess();

    void doJob() {
        dao.execute();
    }
}