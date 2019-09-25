package Package2;
import java.util.*;
public class Que4 {

    public static void main(String[] args){
        int x=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int a=s.nextInt();
        for(int i=0;i<=a;i++){
            System.out.println(i);
            x=x+i;
        }
        System.out.println("the sum is "+x);

    }
}
