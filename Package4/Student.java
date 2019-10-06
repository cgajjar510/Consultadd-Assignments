package Package4;

public class Student {
    int id;
    String name;
    public void displayStudent(){
        System.out.println(+id+ " & "+name);

    }
    public void displayStudent(int id,String name){
        System.out.println("Id is  "+id+ "  & name is "+name);

    }
    public void displayStudent(int id,String name,String city){
        System.out.println("City is "+city);
    }
    public static void main(String[] args) {

        Student s1=new Student();
        s1.displayStudent();
        s1.displayStudent(1,"Chintan");
        s1.displayStudent(1,"Victor","SanFrancisco");


    }


}
