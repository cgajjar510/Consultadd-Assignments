package Package4;

import org.w3c.dom.css.Rect;

public class Rectangle {
    double length,breadth,area;
    public Rectangle(){
       double length,breadth=0;
    }
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;


    }
    public Rectangle(int a){
       length=a;
       breadth=a;


    }
    public void calculateArea(){
        System.out.println("The area is " +(area=length*breadth));


    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(2,2);
        Rectangle r3=new Rectangle(4);
        r2.calculateArea();
        r1.calculateArea();
        r3.calculateArea();

    }
}
