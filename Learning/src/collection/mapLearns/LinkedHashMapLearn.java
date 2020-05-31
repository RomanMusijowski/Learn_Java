package collection.mapLearns;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class LinkedHashMapLearn {
    public static void main(String[] args) {

        Map<Worker, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(new Worker(1,"first"), "one");
        linkedHashMap.put(new Worker(1,"first"), "the fir esjglsgkl;sg jsd");
        linkedHashMap.put(new Worker(3,"third"), "three");
        linkedHashMap.put(new Worker(2,"second"), "two");
        for (Map.Entry<Worker, String> workerStringEntry : linkedHashMap.entrySet()) {
            System.out.println(workerStringEntry);
        }
        //it implements HashMap, so the structure and functionality are basically the same
        //there are additional stuff like a the head el. & the tail el.
        //and it will keep the order of adding elements

        //NO eq & hC
        //What if i will add the same object at the beginning & at the end ????
        //it'll add all of them

        //eq & hC
        //If i'll add different object with the same key it'll replace the previous value
    }
}

class Worker{
    private int id;
    private String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id == worker.id &&
                Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}