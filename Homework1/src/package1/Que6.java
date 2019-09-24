package package1;
import java.util.*;
public class Que6 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s2.nextInt();


        if (number == '1') {
            System.out.println("Enter x: ");
            x = s3.nextInt();
            System.out.println("Enter y: ");
            y = s3.nextInt();
            z = x + y;
            System.out.println(z);
        }

       else if (number == '2') {
            System.out.println("Enter x: ");
            x = s3.nextInt();
            System.out.println("Enter y: ");
            y = s3.nextInt();
            z = x - y;
            System.out.println(z);
       }
        else if (number == '3'){
            System.out.println("Enter x: ");
        x = s3.nextInt();
        System.out.println("Enter y: ");
        y = s3.nextInt();
        z = x / y;
        System.out.println(z);
    }



    }
}