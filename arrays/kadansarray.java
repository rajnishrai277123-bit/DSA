import java.util.*;
public class kadansarray{
    public static void kadans(int numbers[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currentsum=currentsum+numbers[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(currentsum,maxsum);
        }
        System.out.println("The maximum subarray sum is :"+maxsum);
    }
    public static void main(String[] args){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadans(numbers);

    }
}