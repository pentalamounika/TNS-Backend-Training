//conditional statements (if,if-else,)
public class conditionalstms {
    public static void main(String[] args) {
    int x=10;
    int y=15;
    int z=20;
    if(x>y){
        System.out.println("x is lessthan than y");
    }
    else if(z>y){
        System.out.println("z is greater than y");
    }
    else if(y>z){
        System.out.println("y is lesser  than z");
    }
    else{
        System.out.println("none of them");
    }

    //ternary operator
    int score=20;
    String grade=(score>=100)?"pass":"fail";
    System.out.println(grade);

}
}
