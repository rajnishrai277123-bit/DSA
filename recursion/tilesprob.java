public class tilesprob{
    public static int totaltiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=totaltiles(n-1);
        int fnm2=totaltiles(n-2);
        int total=fnm1+fnm2;
        return total;
    }
    public static void main(String[] args){
        System.out.println(totaltiles(2));

    }
}