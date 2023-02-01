package interview;

public class sumOfArray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 11};

        int sum= 0;
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
