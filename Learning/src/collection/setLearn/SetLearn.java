package collection.setLearn;

import java.util.*;

public class SetLearn {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();//kolejka
        Set<String> linkedHashSet = new LinkedHashSet<>();//sortuje
        Set<Student> treeSetStud = new TreeSet<>();

        //eq & hC
        //add everything
        //NO eq & hC
        //will not allow to add the same objects

        //we can add null to hashset
        //If this set already contains an element, the call leaves the set
        //unchanged and returns {@code false}.
        //iterate by simple for (type a : nameOfSet)
        set.add(null);
        System.out.println(set.contains(null));
        set.add(new Student(1));
        set.add(new Student(3));
        set.add(new Student(2));
        set.add(new Student(1));
        for (Student s : set) {
            System.out.println(s);
        }
        System.out.println();

//        //linkedHashSet
//        linkedHashSet.add("one");
//        linkedHashSet.add("three");
//        linkedHashSet.add("two");
//        linkedHashSet.add("four");
//        for (String s : linkedHashSet) {
//            System.out.println(s);
//        }
//        System.out.println();
//
//        //ThreeSet
        treeSet.add("one");
        treeSet.add("three");
        treeSet.add("two");
        treeSet.add("four");
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println();
//
//
//        //ThreeSetStud
//        set.add(new Student(1));
//        set.add(new Student(2));
//        set.add(new Student(3));
//        for (Student s : set) {
//            System.out.println(s);
//        }
    }
}

class Student implements Comparable {

    int id;

    @Override
    public int compareTo(Object o) {
        return id - ((Student)o).id;
    }

    public Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
