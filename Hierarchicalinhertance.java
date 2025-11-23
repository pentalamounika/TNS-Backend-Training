package com.avn.tns.oops;
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
class Circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class Hierarchicalinhertance {
    public static void main(String[] args) {
        
    }
}
