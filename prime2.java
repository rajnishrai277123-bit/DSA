import java.util.*;

public class prime2{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesinrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void binToDec(int bin){
        int pow=0;
        int dec=0;
        while(bin>0){
            int lastdigit=bin%10;
            dec=dec+lastdigit*(int)Math.pow(2,pow);
            pow++;
            bin=bin/10;
        }
        System.out.println("The decimal value is: "+dec);
    }
            
    public static void main(String[] args){
    
       // primesinrange(20);
        binToDec(1010);
}
}