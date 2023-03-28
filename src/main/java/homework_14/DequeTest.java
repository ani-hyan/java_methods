package homework_14;

public class DequeTest {
    public static void main(String[] args) {
        CustomDeque<String> dequeue = new CustomDeque<>();
        dequeue.addFirst("A");
        dequeue.addFirst("B");
        dequeue.addFirst("C");
        dequeue.addFirst("D");

        System.out.println(dequeue.getFirst());
        System.out.println(dequeue.removeFirst());
        System.out.println(dequeue.getFirst());

    }
}
