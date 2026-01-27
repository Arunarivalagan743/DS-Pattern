package Queue.DeQue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue {
    public static void main(String[] args) {
        Deque <Integer> d = new ArrayDeque<>();
        d.addFirst(34);
        d.addFirst(56);
        d.addLast(89);
        d.addFirst(99);
        d.removeFirst();
        System.out.println(d);
    }
}
