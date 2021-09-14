package patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    public void loadEmployees(){
        employees.add("John");
        employees.add("Kasia");
        employees.add("Joanna");
        employees.add("Marta");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<String> list = new ArrayList<>();
        for (String s :
                this.getEmployees()) {
            list.add(s);
        }
        return new Employees(list);
    }
}
