package class05;

import java.util.Scanner;

public class Hw05Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Type here your two favourite colors:");
        String color1= scan.nextLine(), color2= scan.nextLine(), color3;

        color3=color2; //a=b
        color2=color1; //b=a init
        color1=color3;

        System.out.println("Here are your swapped fav colors:");
        System.out.println(color1);
        System.out.println(color2);

    }
}
