package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
       Queue <Integer>q =  new LinkedList<>();
       q.add(67);
        q.add(57); q.add(6);
        System.out.println(q.peek());
    }
}
