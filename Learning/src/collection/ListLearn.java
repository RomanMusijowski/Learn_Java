package collection;

import java.util.*;

public class ListLearn {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();
        List<String> stack = new Stack<>();
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());


        //modify when iterate for(String s : list)
        //modify when iterating FALSE throw exception!!!

        //sort
        //sort (Student) Student has to implement Comparable!!!
        // and has to override compareTo method

        //binary search
        //if list isn't sorted it will return unpredictable value of an object (ex. -2)

        //equals
        // equals for two list will WORK!!!

        //vector vs syncList Collections.synchronizedList(new Arraylist)
        //add is faster in vector
        //iterate is faster in sync list

        //how many elements we can add to arrayLIst
        //2^31 = 2 147 483 648
        //to linkedList we can add more item , because it works by nodes

        //LinkedLink vs ArrayList vs Vector
        //
        //
        //add, remove is better LinkedLink
        //get, set is better  ArrayList
        //Vector each time double size, when ArrayList 50%
        //
        //ArrayList
        //add O(0)      get O(0)    remove O(n)
        //LinkedLink
        //add O(1)      get O(n)    remove O(n)
    }
}
