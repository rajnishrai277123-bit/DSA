import java.util.*;
public class evenodd{
    public static void oddoreven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        oddoreven(number);
    }
}