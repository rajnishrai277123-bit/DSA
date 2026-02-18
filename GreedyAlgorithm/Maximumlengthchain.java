import java.util.*;
public class Maximumlengthchain {
    public static void main(String[] args) {
        int pairs[][] = {{5,24}, {15,25}, {27,40}, {50,60}};
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int maxChain = 1;
        int chainEnd = pairs[0][1];
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                maxChain++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(maxChain);
    }
}