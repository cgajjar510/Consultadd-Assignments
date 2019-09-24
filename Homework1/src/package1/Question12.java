package package1;
import java.util.*;
public class Question12 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any character");
        char word=s.next().charAt(0);
        switch(word){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                    System.out.println("Found");
                    break;
            default:
                System.out.println("not found");
                break;





        }


        }
    }
