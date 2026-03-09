import java.util.*;
public class iteration{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        // Iterating using entrySet
        System.out.println("Using entrySet:");
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterating using keySet
        System.out.println("\nUsing keySet:");
        for(String key : hm.keySet()){
            System.out.println(key + ": " + hm.get(key));
        }

        // Iterating using values
        System.out.println("\nUsing values:");
        for(Integer value : hm.values()){
            System.out.println(value);
        }
    }
}