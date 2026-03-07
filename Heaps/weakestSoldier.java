import java.util.*;
public class weakestSoldier{
    static class Soldier implements Comparable<Soldier>{
        int row;
        int soldiers;

        public Soldier(int row, int soldiers){
            this.row = row;
            this.soldiers = soldiers;
        }
        @Override
        public int compareTo(Soldier s2) {
            if(this.soldiers == s2.soldiers){
                return this.row - s2.row; // Ascending order based on row index
            }
            return this.soldiers - s2.soldiers; // Ascending order based on number of soldiers
        }
    }
    public static void main(String[] args) {
        int[][] soldiers = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 3;
        PriorityQueue<Soldier> pq = new PriorityQueue<>();
        for(int i = 0; i < soldiers.length; i++){
            int count = 0;
            for(int j = 0; j < soldiers[i].length; j++){
                if(soldiers[i][j] == 1){
                    count++;
                } else {
                    break; // Since soldiers are always at the front, we can break once we hit a 0
                }
            }
            pq.add(new Soldier(i, count));
        }
        for(int i = 0; i < k; i++){
            Soldier s = pq.poll();
            System.out.println("Row: " + s.row + ", Soldiers: " + s.soldiers);
        }

}
}