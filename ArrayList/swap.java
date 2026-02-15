import java.arraylist;
public class swap{
    public static void swap(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Before swap: "+list);
        swap(list, 0, 2);
        System.out.println("After swap: "+list);
    }

}