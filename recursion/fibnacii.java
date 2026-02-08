public class fibnacii{
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
            
        }
        
        int fnm1=fibo(n-1);
        int fnm2=fibo(n-2);
        int fn=fibo(n-1)+fibo(n-2);
        return fn;

    }
    public static void main(String[] args){
        int n=5;
        System.out.println(fibo(n));
    }
}