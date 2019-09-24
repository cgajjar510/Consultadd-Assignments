package package1;

public class Que2 {
    public static void main(String[] args) {
        //Swapping number using three variables

        int a = 10;
        int b = 12;
        int c;

        c = a;
        a = b;
        b = c;
        //Updated values
        System.out.println(a);
        System.out.println(b);
//Swapping without third variable
        int x = 5;
        int y = 6;
        System.out.println("Before Swapping x is " + x + " and  y is " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        //After Swapping
        System.out.println(x);
        System.out.println(y);

    }
}
