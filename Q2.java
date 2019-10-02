package Package3;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int[] a = new int[4];
int sum=0;

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the number");
      for(int j=0;j<a.length;j++){
          a[j]=s2.nextInt();


    }
        System.out.println("The sorted array");
        Arrays.sort(a);
       for(int i=1;i<a.length-1;i++){
          sum=sum+a[i];
       }
        System.out.println(sum);
}
}