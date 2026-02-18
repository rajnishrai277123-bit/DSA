import java.util.*;
public class Minimumsumabsolute {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,3,4};

        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i=0; i<A.length; i++){
            sum += Math.abs(A[i] - B[i]);
        }
        System.out.println(sum);
    }
}