import java.util.*;
public class largest{
    public static void largestInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
                
        }
        System.out.println("The largest element in the array is: " +largest);
        System.out.println("The smallest element in the array is: " +smallest);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,-7,8,9,10};
        largestInArray(arr);



    }
}