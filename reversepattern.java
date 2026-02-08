import java.util.*;

public class reversepattern{
    public static void main(String[] args){
        for(int n=1;n<=4; n++){
            for(int star=1;star<=(4-n+1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}