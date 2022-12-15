package class17;

import java.util.Scanner;

public class LoopEx7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of rows:");
        int r=sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int s1 = 1; s1 <= r - i; s1++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1; j++) {
                System.out.print("A");
            }
            for (int s2 = 1; s2 <= r - i; s2++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
