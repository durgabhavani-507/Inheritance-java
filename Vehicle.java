1. Vehicle Hierarchy:

package com.example;

public class Vehiclee{
public static void main(String[] args) {
Vehicle car=new Car("BMW","XYZ", 1234,4);
car.displayInfo();
((Car)car).displayCarInfo();
Vehicle truck=new Truck("TATA", "PQR", 4567, 4);
truck.displayInfo();
((Truck) truck).displayTrcukInfo();
Vehicle motorCycle=new MotorCycle("SUZUKI", "ABC", 6789, true);
motorCycle.displayInfo();
((MotorCycle) motorCycle).displayMotorCycleInfo();
}
}
class Vehicle{
String make;
String model;
int year;
public void displayInfo() {
System.out.println("Make:"+make+"\tModel:"+model+"\tYear"+year);
}
}
class Car extends Vehicle{
int Doors;
public Car(String make,String model,int year,int Doors) {
this.make=make;
this.model=model;
this.year=year;
this.Doors=Doors;
}
public void displayCarInfo() {
System.out.println("Numbers of Doors:"+Doors);
}
}
class Truck extends Vehicle{
double cargoCapacity;
public Truck(String make,String model,int year,double cargoCapacity){
this.make=make;
this.model=model;
this.year=year;
this.cargoCapacity=cargoCapacity;
}
public void displayTrcukInfo(){
System.out.println("Cargo capacity:"+cargoCapacity);
}
}
class MotorCycle extends Vehicle{
boolean hasSideCar;
public MotorCycle(String make,String model,int year,boolean hasSideCar) {
this.make=make;
this.model=model;
this.year=year;
this.hasSideCar=hasSideCar;
}
public void displayMotorCycleInfo() {
if (hasSideCar==true) {
System.out.println("Has Sidecar:"+true);
} else {
System.out.println("Has Sidecar:"+false);
}
}
}

 

 



