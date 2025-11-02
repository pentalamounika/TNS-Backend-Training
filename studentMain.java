// different types of variables 
// student details

class student {

    // Instance Variables
    String name;
    String branch;
    int id;

    //Static Variables
    static String collageName="AVN";

    //Local Variables
    void print(){
        String msg="These are Tns students";
        System.out.println(msg);
        System.out.print("The student:"+name+" "+branch+" "+id+" ");
    }
}

//Executor class for student class

public class studentMain {
    public static void main(String[] args) {
        student s=new student();
        s.name="P.Mounika";
        s.branch="Computer-Science";
        s.id=551;
        s.print();
        System.out.print(student.collageName);

        student s1=new student();
        s1.name="P.Aishwarya";
        s1.branch="AIML";
        s1.id=552;
        s1.print();
        System.out.print(student.collageName);
    }
    
}
