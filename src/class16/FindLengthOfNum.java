package class16;
// print length of given number

import java.util.Scanner;

public class FindLengthOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number to find out its length");
        int num = scan.nextInt();

        int count=0;

       for (; num>0; num=num/10){
           count++;
       }

        System.out.println(count);
    }
}
