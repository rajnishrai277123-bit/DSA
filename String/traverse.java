public class traverse{
    public static void trt(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String firstname="rajni";
        String lastname="kumar";
        //String fullname=firstname+" "+lastname;
        trt(firstname+" "+lastname);
        //trt(lastname);
        System.out.println(firstname.length());

    }
}