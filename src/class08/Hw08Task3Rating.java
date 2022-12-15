package class08;

import java.util.Scanner;

public class Hw08Task3Rating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the rating of the company? (1-5)");
        int rt = scan.nextInt();

        if(rt==1){
            System.out.println("Very Poor");
        }else if(rt==2){
            System.out.println("");
        }else if(rt==3){
            System.out.println("Average");
        }else if(rt==4) {
            System.out.println("Good");
        }else if(rt==5){
            System.out.println("Very Good");
        }else{
            System.out.println("Please give a valid value 1-5!");
        }
    }
}
