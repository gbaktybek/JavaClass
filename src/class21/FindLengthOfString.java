package class21;

import java.util.Scanner;

public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = scan.nextLine();

        int i =0;
        for( char a:name.toCharArray()){
            i++;
        }
        System.out.println(i);


    }
}
