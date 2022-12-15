package class27;

class Bike {
    static int speed;
    int price = 10;

    static void method1() {
        System.out.println(speed);
    }
}

public class StaticMethodJava {
    public static void main(String[] args) {
        Bike.speed = 10;
        Bike.method1();
    }
}
