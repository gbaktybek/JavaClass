package class12;

import java.util.Scanner;

public class FindGreatestNumMethod {
    static int greatestNum(int a, int b, int c){
        if ( a>b ){
            if ( a > c){
                return a;
            }else {
                return c;
            }
        }else {
            if ( b>c) {
                return b;
            }else{
                return c;
            }
    }
}
    static void getReverse( int a){
        int digit3 = a%10;
        int digit2 = (a%100)/10;
        int digit1 = a/100;
        System.out.println("The reverse of the greatest number is:");
        System.out.print(digit3);
        System.out.print(digit2);
        System.out.print(digit1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three 3 digit numbers");
        int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
        getReverse(greatestNum(x,y,z));
    }
}
