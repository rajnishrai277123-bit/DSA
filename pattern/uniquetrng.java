public class uniquetrng{
    public static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
               
            }
            for(int j=1;j<=n-1;j++){
                System.out.print("");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        triangle(5);

    }
}