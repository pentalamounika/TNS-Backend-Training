package com.avn.tns.oops;
class shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*h*l);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*h*l);
    }
}
public class multilevelinheritance {
    Triangle t1=new Triangle();
}
