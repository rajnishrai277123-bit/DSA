import java.util.*;
public class swaparray{
    public static void swap(int numbers[]){
        int first=0, last=numbers.length-1;
        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
   public static void main(String[] args){
    int numbers[]={1,2,3,4,5};
    System.out.println("Before swapping: " + Arrays.toString(numbers));
    swap(numbers);
    System.out.println("After swapping: " + Arrays.toString(numbers));
   } 
}