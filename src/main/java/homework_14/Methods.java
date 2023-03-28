package homework_14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Methods {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue();
        queue1.add(1);
        queue1.add(6);
        queue1.add(5);
        queue1.add(4);

        for (Integer n: queue1) {
            System.out.print(n + ", ");
        }

        System.out.println();

        PriorityQueue<String> queue2 = new PriorityQueue();
        queue2.add("D");
        queue2.add("F");
        queue2.add("A");
        queue2.add("C");

        for (String s: queue2) {
            System.out.print(s + ", ");
        }

        Deque<Float> deque = new ArrayDeque<>();
        deque.add(2.2f);
        deque.add(0f);
        deque.add(-4f);
        deque.add(5.6f);

        System.out.println();

        for (Float f: deque) {
            System.out.print(f + ", ");
        }

        /**
         * Remove elements from a queue until it is empty.
         */
        while(!queue1.isEmpty()){
            queue1.remove();
        }

        /**
         * Remove elements from a deque until it is empty.
         */
        while(!deque.isEmpty()){
            deque.removeFirst();
            deque.removeLast();
        }

    }

    /**
     * Check if an element is present in a queue.
     * @param q
     * @param element
     * @return
     * @param <E>
     */
    public static<E> boolean findElementInQueue(Queue<E> q, E element){
        for (E e: q) {
            if(element.equals(e))
                return true;
        }
        return false;
    }

    /**
     * Check if an element is present in a queue
     * @param q
     * @param element
     * @return
     * @param <E>
     */
    public static<E> boolean findElementInDeque(Queue<E> q, E element){
        for (E e: q) {
            if(element.equals(e))
                return true;
        }
        return false;
    }

}
