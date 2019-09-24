package package1;



import java.util.Scanner;

public class que6_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for Addition \nEnter 2 for Subtraction \nEnter 3 for Division \nEnter 4 for multiplication \nEnter 5 for average ");
        System.out.println("Enter your choice");
        int number = s.nextInt();
        System.out.println("Number is : " + number);

        System.out.println("Enter two int numbers");
        int x = s.nextInt();
        int y = s.nextInt();

        switch (number) {
            case 1:
                System.out.println("Addition of two numbers is : " + (x + y));
                break;
            case 2:
                if (x > y) {
                    System.out.println("Subtraction of two numbers is : " + (x - y));
                }else{
                    System.out.println("x is smaller then y");
                    break;
                }


            case 3:
                if (x > y) {
                    System.out.println("Divison of two number is : " + (x / y));
                }else{
                    System.out.println("x is smaller then y");
                    break;
                }
            case 4:
                System.out.println("Multiplication of two number is  "+(x*y));
                break;
            case 5:
                System.out.println("Average of two number is  "+((x+y)/2));
                break;
        }
    }
}
