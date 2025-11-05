public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator
        int X=10, Y=2;
        System.out.println("the addition value"+" "+(X+Y));
        System.out.println("the subraction value"+" "+(X-Y));
        System.out.println("the division value"+" "+(X/Y));
        System.out.println("the multipliation value"+" "+(X*Y));
        System.out.println("the modulous value"+" "+(X%Y));

        //Assignment operator(+,-,/,*,%)
        int z=X;
        System.out.println("the value of z"+z);//10
        z += Y;
        System.out.println("the value of z"+z);//12

        //Relational operators(<=,>=,==,!=)
        System.out.println(X==Y);

        //Logical operators(&,^,!,&&,||,~)
        System.out.println("the result of and operation "+(X&Y));

        //unary operator(++,--)
        int d=10;
        //post increment
        d++;
        System.out.println("the post increment is:"+d);
        //pre increment
        ++d;
        System.out.println("the pre increment is:"+d);
        //post decrement
        d--;
        System.out.println("the post decrement is:"+d);
        //pre decrement
        --d;
        System.out.println("the pre decrement is:"+d);

        int e=10;
        //post increment
        System.out.println("the post increment of e:"+e++);
        //pre increment
        System.out.println("the pre increment of e:"+(++e));
        //post decrement
        System.out.println("the post decrement of e:"+e--);
        //pre decrement
        System.out.println("the pre decrement of e:"+(--e));

        //ternary operator(condition?a:b)
        int m=10,n=15;
        int max=(m<n) ?m:n;
        System.out.println(max);
    }
}
