import java.util.*;
public class connectNropes {
    public static int connectRopes(int[] ropes){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int rope : ropes){
            pq.add(rope);
        }
        int cost = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            cost += first + second;
            pq.add(first + second);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println("Minimum cost to connect ropes: " + connectRopes(ropes));
    }
}