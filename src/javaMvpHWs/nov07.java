package javaMvpHWs;

import java.util.Scanner;

public class nov07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();
        System.out.println("Now enter a character you want to be Uppercase");
        char ch = scan.next().charAt(0);

        char ch1= Character.toUpperCase(ch);
        for(int i=0; i<str.length();i++){
            if(str.toUpperCase().charAt(i)==ch1){
                System.out.println(str.replace(str.charAt(i),ch1));
            }
        }
    }
}
