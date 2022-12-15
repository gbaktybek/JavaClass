package class09;

import java.util.Scanner;

public class Task1LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year to know if it is Leap year or not");
        int year = scan.nextInt();

        //the first leap year was 1752

        if (year>=1752){
            if ( year%100==0){
                if ( year%400==0 ){
                    System.out.println("Leap Year");
                }else {
                    System.out.println("Not Leap Year!");
                }

            }else {
                System.out.println("Leap Year");
            }
        }else {
            System.out.println("There was no leap year before 1752");
        }
    }
}
