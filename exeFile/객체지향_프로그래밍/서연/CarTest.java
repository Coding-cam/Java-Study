package exeFile.객체지향_프로그래밍.서연;

import org.w3c.dom.ls.LSOutput;

class Car {
    String color;
    String gearType;
    int door;

    Car(){}

    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;
        Car c2 = new Car("white", "auto", 4);
        System.out.println("color " + c1.color + " gearType " + c1.gearType + " door "+ c1.door);
        System.out.println("color " + c2.color + " gearType " + c2.gearType + " door "+ c2.door);
    }

}
