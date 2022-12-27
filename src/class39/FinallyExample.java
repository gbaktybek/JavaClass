package class39;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a[] = {23, 45, 56};
            System.out.println(a[2]);
        } catch (NullPointerException e) {
            System.out.println("Something went wrong!");
        }finally {
            System.out.println("Nice to see you!");
        }
    }
}
