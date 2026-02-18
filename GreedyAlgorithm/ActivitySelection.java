import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int maxAct = 0;
        ArrayList<Integer> activities = new ArrayList<>();
        maxAct = 1;
        activities.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                activities.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(maxAct);
        for(int i=0; i<activities.size(); i++){
            System.out.print(activities.get(i)+" ");
        }
        System.out.println(activities);
    }
}
        