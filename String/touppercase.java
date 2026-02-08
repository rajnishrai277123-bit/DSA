public class touppercase{
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch[]=Character.toUpperCase(str.toCharArray(0));
        sb.append(ch[0]);
        for(int i=0; i<ch.length; i++){
            if(ch[i]==' ' && i<ch.length-1){
                sb.append(ch[i]);
                i++;
                sb.append(Character.toUpperCase(ch[i]));
                
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str="rajni kumar";
        System.out.println(toUpperCase(str));
    }
    }