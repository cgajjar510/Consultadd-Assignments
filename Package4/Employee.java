package Package4;

import java.sql.SQLOutput;

class Employee {
    public static void main(String[] args) {

        System.out.println("Name:    year of Joining     Address");
        Employee1 e1=new Employee1("Robert",1994,"64-C Walls Streat");
        e1.displayEmployee();
        Employee1 e2=new Employee1("Sam",2000,"68D-Walls Streat");
        e2.displayEmployee();
        Employee1 e3=new Employee1("John",1999,"26B-Walls Streat");
        e3.displayEmployee();


    }
}
