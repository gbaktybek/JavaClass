package class11;

import java.util.Scanner;

public class SwitchMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month to see how many days are in it (1-12)");
        int month = scan.nextInt();

        switch (month){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28/29");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("31");
                break;
            case 7:
                System.out.println("30");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println(" Give month number between 1 and 12 only");
        }
    }
}
