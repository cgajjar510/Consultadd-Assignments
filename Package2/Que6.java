package Package2;
import java.util.*;
public class Que6 {
    public static void main(String[] args){
        long sum=0;
        long t=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        long a=s.nextLong();
        while(a>0){
           t=a%10;
            sum=sum+t;
            a=a/10;

        }
        System.out.println(sum);
    }
}
