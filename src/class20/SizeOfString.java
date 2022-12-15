package class20;
// Write a program to take String form a user using scanner class
// Count the number of spaces from the String
// Print String is small if number of spaces less than 5
// Print String is medium if number of spaces
// Greater than or equal to 5 and less that 10
// Print String is large if number of spaces greater than 10

import java.util.Scanner;

public class SizeOfString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);

        if(count<5){
            System.out.println("small");
        }else if(count<10){
            System.out.println("medium");
        }else{
            System.out.println("large");
        }

    }
}
