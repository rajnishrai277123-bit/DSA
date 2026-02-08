public class duplicateinstring{
    public static boolean duplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return false;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            return true;
        }
        map[currchar-'a']=true;
        newstr.append(currchar);
        boolean res=duplicate(str, idx+1, newstr, map);
        newstr.deleteCharAt(newstr.length()-1);
        return res;

    }
    public static void main(String[] args){
        String str="abcde";
        boolean map[]=new boolean[26];
        System.out.println(duplicate(str, 0, new StringBuilder(""), map));
        
    }
}