package class17;

import java.util.Scanner;

public class LoopEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the number of rows you want");
        int num= scan.nextInt();

        for (int i = 1; i <num/2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        for ( int i=1; i<=num/2; i++ ){
            for(int j=1; j<=num/2+1-i; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
