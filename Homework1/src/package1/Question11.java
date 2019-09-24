package package1;
import java.util.*;
public class Question11 {
    public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
float f1=s.nextFloat();
if(f1==0){
    System.out.println("zero");

}
else if(f1>0){
    System.out.println("positive");
    if((f1<1)){
        System.out.println("small");
    }
    else if(f1>1000000){
        System.out.println("large");
    }
}
else if(f1<0){
    System.out.println("negative");
}
    }
}
