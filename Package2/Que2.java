package Package2;
import java.util.*;
public class Que2 {
    public static void main(String[] args){
        int x=0;

        Scanner s=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("Enter the number "+i);
            int a=s.nextInt();
        x=x+a;
        }
        System.out.println( "The sum is  "+x);
        System.out.println("the average is "+(x/10));


        }
    }
