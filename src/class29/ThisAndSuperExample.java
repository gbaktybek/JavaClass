package class29;

class Vehicle {
    int speed = 50;

    void drift() {
        System.out.println("Drifting the car");
    }
}
// this keyword refers to current class object
class Car extends Vehicle {
    int speed = 100;

    void drift() {
        int speed = 200;
        System.out.println(speed);//200
        System.out.println(this.speed);//100 - this -> current class
        System.out.println(super.speed);//50 - super -> parent class
        // drift(); -> the process of calling function itself called Recursion
        super.drift();
    }
}

public class ThisAndSuperExample {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.speed);//100
        c.drift();//200 //100 //50
    }
}
