package class08;

public class LogicalOperator  {
    public static void main(String[] args) {
        boolean a = true, b = false;
        boolean c = true;

        System.out.println(a || a); // true
        System.out.println(a || b); //true
        System.out.println(b || a); //true
        System.out.println(b || b); //false

        System.out.println(a && b); //false

        System.out.println(!a); //false
        System.out.println(!b); //true
        System.out.println(!(a && b)); //true

        System.out.println(a || b && c); //true
        System.out.println(a && b || c); //true
        System.out.println(b || a && c); //true
    }
}
