import java.util.*;
public class bubble{

    public static void bubbleSort(int numbers[]){
        int swapped=0;
        for(int i=0;i<numbers.length-1;i++){
            //int swapped=0;
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    //swap
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swapped++;
                }
            }
        }

        //print sorted array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
            //System.out.println(swapped);
        }
        System.out.println(swapped);

        
    }
    public static void main(String[] args){
        int numbers[]={5,4,1,3,2};
        bubbleSort(numbers);

        
    }
        
}
