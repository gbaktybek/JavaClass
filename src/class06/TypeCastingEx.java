package class06;

public class TypeCastingEx {
    public static void main(String[] args) {
        double a = 10, b = 20;
        int result;
        result = (int) (a/b);

        System.out.println(result);

        double d = 2.9;
        int e = (int) d;
        System.out.println(e);

        int x = 3;
        double y = x; //can convert smaller type to larger without()

    }
}
