package class41;

public class GenericExample {
    public static void main(String[] args) {
//        Box num1 = new Box();
//        BoxString name = new BoxString();
//
//        num1.setData(50);
//        System.out.println(num1.getData());
//
//        name.setData("Guldana");
//        System.out.println(name.getData());

        Box<Integer> intBox = new Box<>();
        intBox.setData(10);
        System.out.println(intBox.getData());

        Box<String> stringBox = new Box<>();
        stringBox.setData("Guldana");
        System.out.println(stringBox.getData());
    }
}
