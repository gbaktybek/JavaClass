package class22;

// Write a program to print the sum of even and odd numbers
//Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//Output : Sum Of Even - 134, Sum Of Odd - 206
public class ArrayHw1 {
    public static void main(String[] args) {

        int[] num = { 23, 44, 21, 56, 27, 35, 75, 34, 25 };
        int even=0, odd=0;

        for (int j : num) {
            if (j % 2 == 0) {
                even = even + j;
            } else {
                odd = odd + j;
            }
        }
        System.out.println("Sum of Even: "+even);
        System.out.println("Sum of Odd: "+odd);
    }
}
