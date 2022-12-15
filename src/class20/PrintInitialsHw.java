package class20;

import java.util.Scanner;

public class PrintInitialsHw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name= scan.nextLine();
        getInitials(name);


    }
    static void getInitials(String name) {
        System.out.println(name.charAt(0)+"."+name.charAt(name.lastIndexOf(" ")+1));
    }
}
