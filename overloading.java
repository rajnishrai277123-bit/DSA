import java.util.*;

public class overloading{
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println("Sum of 2 numbers: "+sum(10,20));
        System.out.println("Sum of 3 numbers: "+sum(10,20,30));
    }
}
