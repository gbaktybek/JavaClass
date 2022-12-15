package class08;

import java.util.Scanner;

public class Hw08Task4Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character to check given character is vowel or not");
        System.out.println("Warning: use lower-case letter or you won't get the right answer");
        char ch = scan.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Not Vowel");
        }
    }
}
