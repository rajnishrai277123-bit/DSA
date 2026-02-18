import java.util.*;
public class Indiancoin{
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(coins, Collections.reverseOrder());
        int count = 0;
        int amount = 93;
        ArrayList<Integer> usedCoins = new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            while(coins[i] <= amount){
                count++;
                amount -= coins[i];
                usedCoins.add(coins[i]);
            }
        }
        System.out.println("Minimum number of coins required: " + count);
        System.out.println("Used coins: " + usedCoins);
    }
}