package collection.mapLearns;

import java.util.*;

public class HashMapLearn {
    public static void main(String[] args) {
        Map<OBJ, String> hashMap = new HashMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        //how to store elements
        //table of nodes
        //here is an array of nodes Node<N,K>[] node = hash(key), key, value, next node

        //table index is calculated by hC of a key % 16(init capacity)
        //if the hashCode value (of added object) is the same as in an object that already exist in a map
        //new node will be added after existing node in a table index with the same & hashCode, but their equals
        //will be different

        //eq & hC present
        //add the same object isn't possible
        //add different value with the same key is possible, update value
        //eq & hC absent
        //add the same objects possible
        //add different value with the same keys possible, store everything
        //EXCEPT NULL! in case of storing null there can be only one null key

        //max capacity 2^30 = 2 700 000
        //init capacity 2^4 = 16

        //load factor = 0.75. Means if 12 cell will contain an item table will grow * 2 = 32

        //Java 8 increased performance by changing HashMap structure into a black/red tree
        //When there is too many collisions. Complexity will change from line to log
        hashMap.put(null, "gdf  gdfgd null ");
        hashMap.put(null, null);
        hashMap.put(null, "null string");
        hashMap.put(new OBJ(1,"first"), "one");
        hashMap.put(new OBJ(1,"first"), "the fir esjglsgkl;sg jsd");
        hashMap.put(new OBJ(3,"third"), "three");
        hashMap.put(new OBJ(2,"second"), "two");
        hashMap.put(new OBJ(2,"second"), "sdfs ds kldgss ");
//        hashMap.put(new OBJ(1,"first"), "one");

        for (Map.Entry<OBJ, String> objStringEntry : hashMap.entrySet()) {
            System.out.println(objStringEntry);
        }
    }
}

class OBJ {
    private int id;
    private String name;

    public OBJ(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBJ obj = (OBJ) o;
        return id == obj.id &&
                Objects.equals(name, obj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "OBJ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


