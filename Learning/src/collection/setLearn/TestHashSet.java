package collection.setLearn;

import java.util.HashSet;
import java.util.Objects;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Animal());
        set.add(new Animal());
//        set.add(new Animal());
        System.out.println();
        for (Object o : set) {
            System.out.println(o.toString());
        }
    }
}

class Animal {
    int i = 12;

    public Animal() {
        this.i = 144;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return i == animal.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "i=" + i +
                '}';
    }
}