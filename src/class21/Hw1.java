package class21;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = scan.nextLine();

        getVowelConsonants(name);

    }

    static void getVowelConsonants(String name) {
        int vowels = 0, consonants = 0, space=0;
        name=name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                vowels++;
            } else if (name.charAt(i) == ' ') {
                space++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants " + consonants);
    }
}
