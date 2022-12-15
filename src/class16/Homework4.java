package class16;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number to find its factors:");
        int num = scan.nextInt();

        for (int i=1; i>=1; i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
