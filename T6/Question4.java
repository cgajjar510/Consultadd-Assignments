package T6;

import java.util.*;

   class Demo1 {
       public void D1() {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your string");
           String ss = input.nextLine();
           String r = ss.replaceAll("[aeiouAEIOU]", "");
           System.out.println(r);
       }
   }
public class Question4{
    public static void main(String[] args) {
        Demo1 ch=new Demo1();
        ch.D1();

    }
}
