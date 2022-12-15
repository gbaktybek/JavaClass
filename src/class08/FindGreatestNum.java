package class08;

import java.util.Scanner;

public class FindGreatestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is the greatest number");
        }else if(b>c){
            System.out.println(b + " is the greatest number");
        }else{
            System.out.println(c + " is the greatest number");
        }
    }
}
