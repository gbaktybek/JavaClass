package class12;

import java.util.Scanner;

public class Task2EvenOdd {
    static void oddEven(int num){
        if ( num%2==0 ){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it's even or odd");
        int a = sc.nextInt();

        oddEven(a);
    }
}
