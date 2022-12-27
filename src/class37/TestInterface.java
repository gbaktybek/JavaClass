package class37;

public class TestInterface {
    public static void main(String[] args) {
        //Polymorphism => an ability to take different shapes
        //dynamic polymorphism - you don't know what type of object
        //you are going to create in advance
        //you can choose what type of object to create during the runtime.

        FirstInterface i = new Subclass();
        i.play();
    }
}
