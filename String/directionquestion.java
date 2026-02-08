import java.util.*;
public class directionquestion{
    public static int getshortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++){
            char direction=path.charAt(i);
            if(direction=='N'){
                y++;
            }
            else if(direction=='S'){
                y--;
            }
            else if(direction=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (int)Math.sqrt(x2+y2);
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
        
}