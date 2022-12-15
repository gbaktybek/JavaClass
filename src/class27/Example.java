package class27;

class Car{
    static int numOfCars;
    Car(){
        numOfCars++;
    }
}

public class Example {
    public static void main(String[] args) {
        Car toyota = new Car();
        Car bmw = new Car();
        Car audi = new Car();

        System.out.println(toyota.numOfCars);
        System.out.println(bmw.numOfCars);
        System.out.println(audi.numOfCars);
        System.out.println(Car.numOfCars);
    }
}
