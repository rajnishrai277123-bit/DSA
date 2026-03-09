import java.util.*;
public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("USA", 50);
        System.out.println(tm);
        // get
        System.out.println(tm.get("India"));
        // containsKey
        System.out.println(tm.containsKey("China"));
        System.out.println(tm.containsKey("France"));
        // remove
        tm.remove("USA");
        System.out.println(tm);
        // size
        System.out.println(tm.size());
        //isempty
        System.out.println(tm.isEmpty());
        //clear
        tm.clear();
        System.out.println(tm);
    }
}