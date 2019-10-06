package Package4;

public class Programming {
    String prog;



    public Programming(String language){
        this.prog=language;
    }
    public Programming(){
        prog="programming language";

    }

    public void  displayProgramming(){
        System.out.println("i love " +prog);
    }
    public static void main(String[] args) {
        Programming p1=new Programming("Java");
        p1.displayProgramming();
        Programming p2=new Programming();
        p2.displayProgramming();

    }
}
