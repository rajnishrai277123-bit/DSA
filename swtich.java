import java.util.*;

public class swtich{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1: monday:
                System.out.println("Monday");
                break;
            case 2: tuesday:
                System.out.println("Tuesday");
                break;
            case 3: wednesday:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }
}