package Package2;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class Que5 {
    public static void main(String[] args){
        int n=1;
long sum=0;
long q=0;
Scanner s=new Scanner(System.in);
        System.out.println("Enter any long number");
        long a=s.nextLong();
        for(;n<=a/10;n++){
            a=a/10;
            n=n+1;
        }
        System.out.println(n);
/*while(a>0){
    q=a%10;
    sum=sum+q;
    a=a/10;

}

        System.out.println(sum);*/
  }


        }





