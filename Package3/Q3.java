package Package3;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String ss=sc.nextLine();
        String sop=ss.replaceAll("\\s","");
        System.out.println(sop);

    }
}