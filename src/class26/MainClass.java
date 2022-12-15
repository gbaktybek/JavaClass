package class26;

public class MainClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.speed= 200;
        c1.color = "white";
        c1.drive();
        c2.drive();

        c1.speed = c1.increaseSpeed(c1.speed);

        c2.decreaseSpeed(c1);

        c1.makeSpeedZero();

        System.out.println(c1.speed);

    }
}
