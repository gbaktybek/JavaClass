package class25;

public class FruitsMain {
    public static void main(String[] args) {
        Fruits apple = new Fruits();
        Fruits banana = new Fruits();
        Fruits peach = new Fruits();

        apple.weight = 3;
        apple.price = 1.99f;
        apple.getCost();

        System.out.println();

        banana.cost = 4.3f;
        banana.price = .99f;
        banana.getWeight();
        banana.color = "Yellow";
        System.out.println(banana.color);

        System.out.println();

        peach.weight = apple.weight;
        peach.cost= apple.cost;
        peach.getPrice();

        System.out.println("============================================");


        System.out.println("Homework Nov 16");


        System.out.print("1)");
        Fruits lemon = new Fruits(3,5);
        System.out.print("2)");
        Fruits orange = new Fruits("orange");
        System.out.print("3)");
        Fruits tomato = new Fruits("red", 2.99f);
        System.out.println(tomato.color);
        System.out.println(tomato.price);

    }
}
