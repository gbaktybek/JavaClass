package class21;

import java.util.Scanner;

public class FindReverseOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String name = scan.nextLine();

        for (int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(name.length()-1-i));
        }
    }
}
