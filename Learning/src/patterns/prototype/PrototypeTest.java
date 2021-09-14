package patterns.prototype;

import java.util.ArrayList;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadEmployees();

        Employees copy = (Employees) employees.clone();
        Employees copy2 = (Employees) employees.clone();

        ArrayList<String> list = (ArrayList<String>) copy.getEmployees();
        list.add("New Emp");

        ArrayList<String> list2 = (ArrayList<String>) copy2.getEmployees();
        list2.remove("Kasia");

        System.out.println(employees.getEmployees());
        System.out.println(list);
        System.out.println(list2);

    }
}
