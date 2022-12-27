package class39;

public class GetInfoFromException {
    public static void main(String[] args) {

        try {
            int a[] = {23, 45, 56};
            System.out.println(a[3]);
        } catch (Exception e) {
            e.printStackTrace(); //print kind of exception
        }

        System.out.println("Nice to see you");
    }
}
