import java.util.*;
public class DistinctElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        System.out.println("Number of distinct elements: " + hs.size());
        System.out.println("Distinct elements are: " + hs);
    }
}