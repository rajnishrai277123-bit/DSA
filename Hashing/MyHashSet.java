import java.util.*;
public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2); // duplicate, will not be added
        System.out.println(hs); // Output: [1, 2, 3]
        if(hs.contains(2)){
            System.out.println("HashSet contains 2");
        }
        hs.remove(2);
        System.out.println(hs); // Output: [1, 3]
        System.out.println("Size of HashSet: " + hs.size());

    }
}