import java.util.*;
public class binary{
    public static void binarysearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        binarysearch(arr,2);
        
}
}