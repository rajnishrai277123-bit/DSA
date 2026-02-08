public class optimisedsol{
    public static int optimisedpower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimisedpower(a,n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2!=0){
             return halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args){
    System.out.println(optimisedpower(2,10));

    }
}