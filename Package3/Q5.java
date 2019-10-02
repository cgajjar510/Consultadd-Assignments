package Package3;
import java.lang.String;
public class Q5 {
    public static void main(String[] args) {
        String s = "Be Happy and Stay Motivated";
        String finalresult="";
        String[] ch=s.split("\\s");
        for(String w:ch){
            StringBuilder ccc=new StringBuilder(w);
            ccc.reverse();
            finalresult=finalresult+ccc.toString()+" ";
        }
        System.out.println(finalresult.trim());




    }
}