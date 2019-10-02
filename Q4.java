package Package3;
import java.util.*;

public class Q4 {
    boolean uniqueMethod(String n){
        n.toLowerCase();
        for(int i=0;i<n.length();i++){
            for(int j=i+1;j<n.length();j++){
                if(n.charAt(i)==n.charAt(j))
                return false;


                }
            }
       return true;
    }



    public static void main(String[] args) {
     Q4 que=new Q4();
        System.out.println(que.uniqueMethod("chintan"));
        }



    }

