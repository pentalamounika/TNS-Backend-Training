package com.avn.tns.oops;
// single-level inheritance
class shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends shape{
    public void area(int l,int h){
        System.out.println(1/2*h*l);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.area();
    }
}
