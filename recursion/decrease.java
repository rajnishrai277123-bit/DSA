public class decrease{
    public static void decfun(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+"");
        decfun(n-1);

    }
    public static void main(String[] args){
        int n=10;
        decfun(n);
    }
}