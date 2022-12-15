package class32;

public class Car {
    public static void drive() {
        System.out.println("Car driving");
    }

    void m2() {
        System.out.println("m2 from Car");
    }
}

class Toyota extends Car{
    public static void drive(){
        System.out.println("Toyota driving");
    }
}
