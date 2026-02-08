public class friendpair{
    public static int friendPair(int n){
        if(n==1 || n==2){
            return n;
        }
        // choice 1: single
        int fnm1 = friendPair(n-1);
        // choice 2: pair up with any of the n-1 friends
        int fnm2 = (n-1)*friendPair(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendPair(n));

    }
}