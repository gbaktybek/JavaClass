package class15;

import java.util.Scanner;

public class Sum1to5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();
        int mul= 1;
        for (int i=1; i<=num; i++) {
            mul = mul * i;
        }
        System.out.println(mul);
    }
}
