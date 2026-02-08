import java.util.*;
public class  prefixsum{
    public static void maxsbarays(int numbers[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }


        for(int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i+1; j<numbers.length; j++){
                int end=j;
                currentsum=0;

                
                }
                System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }

            }
            
        }
        System.out.println(maxsum);

    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        maxsbarays(numbers);

    }

}