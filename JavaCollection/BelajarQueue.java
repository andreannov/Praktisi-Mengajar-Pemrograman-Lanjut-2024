package PraktisiMengajar;

import java.util.ArrayDeque;
import java.util.Queue;

public class BelajarQueue {
    public static void main(String[] args) {
        Queue<String> queues = new ArrayDeque<>(10);
        queues.offer("Gibranda");
        queues.offer("andrean");
        queues.offer("wedanta");
        
        for(String next = queues.poll(); next != null; next = queues.poll()){
            System.out.println(next);
        }
        System.out.println(queues.size());
    }
}
