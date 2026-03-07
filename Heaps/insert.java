import java.util.*;
public class insert {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x = arr.size() - 1; // x is the index of the newly added element
            int par = (x - 1) / 2; // parent index

            while(arr.get(x) < arr.get(par)){
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        
    }
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.add(20);
        heap.add(15);
        heap.add(30);
        heap.add(40);
        System.out.println(heap.arr);
    }
}