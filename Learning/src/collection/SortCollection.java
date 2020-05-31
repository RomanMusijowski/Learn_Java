package collection;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//if we dont have access to a class we can create an comparator class & give it to an list
public class SortCollection {
    public static void main(String[] args) {
        StudentComparator studentComparator = new StudentComparator();
        Set<StudentForComp> set = new TreeSet<>(studentComparator);
        set.add(new StudentForComp(3));
        set.add(new StudentForComp(6));
        set.add(new StudentForComp(9));
        for (StudentForComp student : set) {
            System.out.println(student);
        }
    }
}

class StudentComparator implements Comparator<StudentForComp>{

    @Override
    public int compare(StudentForComp o1, StudentForComp o2) {
        return o1.getAge() - o2.getAge();
    }
}

class StudentForComp{
    private int age;

    public StudentForComp(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentForComp{" +
                "age=" + age +
                '}';
    }
}


