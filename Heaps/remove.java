import java.util.*;
public class remove{
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
        public void remove(){
            int data = arr.get(0);
            // step 1: swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2: delete last
            arr.remove(arr.size() - 1);

            // step 3: heapify
            int i = 0;
            while(i < arr.size()){
                int leftIndex = 2 * i + 1;
                int rightIndex = 2 * i + 2;
                int minIndex = i;

                if(leftIndex < arr.size() && arr.get(minIndex) > arr.get(leftIndex)){
                    minIndex = leftIndex;
                }
                if(rightIndex < arr.size() && arr.get(minIndex) > arr.get(rightIndex)){
                    minIndex = rightIndex;
                }

                if(minIndex == i){
                    break;
                }

                // swap
                temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                i = minIndex;
            }
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
        heap.remove();
        System.out.println(heap.arr);
    }
}