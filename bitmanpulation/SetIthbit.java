import java.util.*;
public class SetIthbit{
    public static int getBit(int n,int i){
        int bitmask=1<<i;
       return n|bitmask;
    }
    public static void main(String[] args){
        
        System.out.println(getBit(10,2));
    }
}