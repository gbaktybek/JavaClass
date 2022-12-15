package class21;

import java.util.Locale;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check your text if it's palindrome or not");
        String str= scan.nextLine();

        checkForPalindrome(str);

    }
    static void checkForPalindrome(String str){
        str=str.toLowerCase();
        str=str.replaceAll(" ", "");
        String reverse="";

        for(int j=str.length()-1;j>=0;j--){
            reverse=reverse + str.charAt(j);
        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}