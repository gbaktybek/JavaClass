package class18;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Give a number:");
        int num= scan.nextInt();
        int rev=0;
        int originNum=num;

        for(; num!=0; num=num/10){
            int lastDigit=num%10;
            rev=rev*10+lastDigit;
        }

        System.out.println(rev+" Reverse");
        System.out.println(num+" -value of num");
        System.out.println();
        if (rev==originNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
