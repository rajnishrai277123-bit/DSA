import java.util.*;

public class whilesum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
            i++;
            
            
        }
    System.out.println("The sum is: "+sum);
    }
}