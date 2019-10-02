package Package3;

public class Q7 {
    public static void main(String[] args) {


    String word="HellO";
    StringBuffer ss=new StringBuffer(word);
    int in=word.length();

    for(int i=0;i<in;i++)
    {
    Character o=word.charAt(i);
    if(Character.isLowerCase(o)){
    ss.replace(i,i+1,Character.toUpperCase(o)+" ");
}
    else{
    ss.replace(i,i+1,Character.toLowerCase(o)+" ");
    }
    }
        System.out.println(ss);
    }
}