import java.util.ArrayList;
public class operation{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // get
        int element = list.get(0);
        System.out.println(element);
        // remove
        list.remove(1);
        System.out.println(list);
        // size
        int size = list.size();
        System.out.println(size);
        //set
        list.set(0, 10);
        System.out.println(list);
        // contains
        boolean ans = list.contains(10);
        System.out.println(ans);
        //print all elements        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //reverse print
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        //max element
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("Max element: "+max);
    }
}