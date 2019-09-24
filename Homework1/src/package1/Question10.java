package package1;
import java.sql.SQLOutput;
import java.util.*;
public class Question10 {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the number");
        int s= ss.nextInt();
        if(s%2!=0) {
            System.out.println("New");
        }
            else {
              if((s%2==0)&&((s>=2 && s<=5))){
                  System.out.println("Old");
              }
              else{
                  if((s%2==0)&&((s>=6 && s<=30))){
                      System.out.println("new");
                  }
                  else{
                      if((s%2==0) && s>=30){
                          System.out.println("old");
                      }
                  }

              }

                }
            }
        }


