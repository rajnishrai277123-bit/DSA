import java.util.*;
public class Kanpsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int W = 50;
        double ratio[][] = new double[val.length][2];
        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        Arrays.sort(ratio, (a,b) -> Double.compare(b[1], a[1]));
        int finalVal = 0;
        for(int i=0; i<ratio.length; i++){
            int idx = (int)ratio[i][0];
            if(wt[idx] <= W){
                finalVal += val[idx];
                W -= wt[idx];
            } else {
                finalVal += ratio[i][1] * W;
                break;
            }
        }
        System.out.println(finalVal);
    }
}