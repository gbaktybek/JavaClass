package class20;
// Write a program to find frequency of given character
// the string

// String - Hello, How are you?
// Character -e
// Output - 2

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your full name:");
        String str = scan.nextLine();
        System.out.println("Enter the character you want to find frequency of:");
        char target = scan.next().charAt(0);

        getFrequencyOfChar(str,target);
    }

    static void getFrequencyOfChar(String str, char target){
        int count=0;
        for ( int  i= 0; i< str.length(); i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
