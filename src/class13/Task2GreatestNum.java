package class13;

import java.util.Scanner;

public class Task2GreatestNum {
    static void print(int num){
        System.out.println(num + " is the greatest number");
    }
    static void printGreatestNum ( int a, int b, int c, int d){
        if (a > b || c > d) {
            if (a > c) {
                print(a);
            }else {
                print(c);
            }
        } else {
            if (b > d) {
                print(b);
            }else {
                print(d);
            }
            }
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter four number");
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        int num3 = scan.nextInt(), num4 = scan.nextInt();

        printGreatestNum(num1,num2,num3,num4);
        }

    }


