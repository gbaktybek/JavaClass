package class39;

public class MultipleException {
    public static void main(String[] args) {
        try {
            int a[] = {23, 45, 56};

            System.out.println(a[3]);

            String str = "null";
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound");
        } catch (NullPointerException e) {
            System.out.println("you are accessing a null object");
        } catch (ArithmeticException e) {
            System.out.println("a number cannot be divided by zero");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
