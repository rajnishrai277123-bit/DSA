public class increase{
    public static void decfun(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        decfun(n-1);
        System.out.print(n+"");
        //decfun(n-1);

    }
    public static void main(String[] args){
        int n=10;
        decfun(n);
    }
}