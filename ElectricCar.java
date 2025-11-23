package com.avn.tns.oops;

public class ElectricCar extends vehicle {
    public int batterycapcity;
    public ElectricCar(String brand,String model,String type,int batterycapcity){
        super(brand,model,type);
        this.batterycapcity=batterycapcity;
    }

}
