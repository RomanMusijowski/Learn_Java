package collection;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueLearn {
    public static void main(String[] args) {
        Deque<String> dequelinkedList = new LinkedList<>();
        //has a lot for methods like a addFirst, addLast...
        //but it's slow and used very rare

        Deque<String> arrayDeque = new ArrayDeque<>();
        //it works by indexes like arraylist
        //and it's faster that linkedLIst & arrayList

        Queue<String> priorityQueue = new PriorityQueue<>();
        // it's ordered, but if you want to see the order, you have to make remove()
        //by simple for loop it will not show the order

        Queue<String> linkedBlockedDeque = new LinkedBlockingDeque<>();
        //we have a list with a fixed size, after filling up the list one thread will wait
        //until the second take out an item
        //sth like this




    }
}
