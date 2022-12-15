package class30;

class Demo {
    void sum(int a, int b) {

    }

    void sum(double a, double b) {

    }

    void sum(int a, int b, int c) {

    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sum(1, 2);
        d.sum(1, 2, 3);
        d.sum(2.3, 4.6);
    }
}
