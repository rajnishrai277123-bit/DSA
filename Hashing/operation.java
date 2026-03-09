import java.util.*;
public class operation{
    public static void main(String[] args){
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        System.out.println(hm);
        // get
        System.out.println(hm.get("India"));
        // containsKey
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("France"));
        // remove
        hm.remove("USA");
        System.out.println(hm);
        // size
        System.out.println(hm.size());
        //isempty
        System.out.println(hm.isEmpty());
        //clear
        hm.clear();
        System.out.println(hm);
    }
}