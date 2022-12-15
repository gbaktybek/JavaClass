package class05;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        a = b;
        b = 10;

        System.out.println(a);
        System.out.println(b);

        //Or

        int x = 2, y = 3, z;// declare 3rd var to swap two numbers

        z=x;
        x=y;
        y=z;

        System.out.println(x);
        System.out.println(y);
    }
}
