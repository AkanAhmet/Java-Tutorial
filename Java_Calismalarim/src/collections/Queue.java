package collections;

import java.util.*;

public class Queue {
    
    public static void print(LinkedList<Integer>linkedList) {

        for(Integer item : linkedList) {
            System.out.println("Queue :\t" + item);
        }


    }
    public static void main(String[] args) {
        
        LinkedList<Integer> queue = new LinkedList<> ();

        queue.add(0); // returns Exception if add doesn't work.
        queue.offer(5); // returns false if offer(addition to queue) doesn't work.
        queue.offer(15);
        queue.offer(25);
        queue.offer(35);
        queue.offer(45);
        queue.offer(55);

        Queue.print(queue);

        System.out.println(" remove():\t" + queue.remove()); // returns first element and remove it from queue.
        System.out.println("element():\t" + queue.element()); // returns first element, doesn't remove it.

        Queue.print(queue);

        System.out.println(" peek:\t" + queue.peek()); // returns first element, doesn't remove it. Can be null if queue is empty.
        System.out.println(" pool:\t" + queue.poll()); // returns first element and remove it from queue, Can be null if queue is empty.

        Queue.print(queue);
        
    }
}
