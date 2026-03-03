import java.util.PriorityQueue;
public class demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Peek: " + pq.peek());

        System.out.println("Poll: " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);
    }
}