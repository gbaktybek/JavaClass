package class17;

import java.util.Scanner;

public class LoopEx8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of rows:");
        int r=sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int s1 = 1; s1 <= i-1; s1++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=r*2-i*2+1; j++) {
                System.out.print("A");
            }
            for (int s2 = 1; s2 <= i-1; s2++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
