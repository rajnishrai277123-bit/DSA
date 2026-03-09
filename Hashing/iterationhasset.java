import java.util.*;
public class iterationhasset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("China");
        hs.add("USA");
        // Iterating using for-each loop
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}