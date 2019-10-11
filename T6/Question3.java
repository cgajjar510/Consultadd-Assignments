package T6;

import java.util.*;
class Reverse {
    public static void reversingWord(String s1) {

        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) != ' ') {
                st.push(s1.charAt(i));
            } else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (st.empty() == false) {
            System.out.print(st.pop());

        }
    }
}
    class Question3 {
        public static void main(String[] args) {
            Reverse r1=new Reverse();
            Scanner ss = new Scanner(System.in);
            System.out.println("Enter the String value:");
            String s1 = ss.nextLine();

            r1.reversingWord(s1);
        }
    }
