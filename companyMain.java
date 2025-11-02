// Demo for class structure
 class company{
    String name;
    String employees;
    int numberofemp;
    String branch;
    void print(){
        System.out.println("the company details are:");
    }
}

//Execution of the class strucutre
public class companyMain {
    public static void main(String[] args) {
        //object class
        company c=new company();
        c.name="TNS-Training";
        c.employees="Lavanya Mam";
        c.branch="hyderabad";
        c.numberofemp=1;
        c.print();

        company c1=new company();
        c1.name="TNS-Training";
        c1.employees="Lavanya Mam";
        c1.branch="hyderabad";
        c1.numberofemp=1;
        c1.print();
    }
}
