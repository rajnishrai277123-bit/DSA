import java.util.*;
public class linkedhashmapcode{
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);
        System.out.println(lhm);
        // get
        System.out.println(lhm.get("India"));
        // containsKey
        System.out.println(lhm.containsKey("China"));
        System.out.println(lhm.containsKey("France"));
        // remove
        lhm.remove("USA");
        System.out.println(lhm);
        // size
        System.out.println(lhm.size());
        //isempty
        System.out.println(lhm.isEmpty());
        //clear
        lhm.clear();
        System.out.println(lhm);
    }
}