package homework_14;

public class QueueTest {
    public static void main(String[] args) {
        CustomQueue<String> queue = new CustomQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        for(int i = 0; i<queue.size(); i++){
            System.out.print(queue.remove() + ", ");
        }
    }
}
