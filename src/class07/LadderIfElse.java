package class07;

import java.util.Scanner;

public class LadderIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("On which day of a week you go to gym? (0-6)");
        int day = scan.nextInt();

        if (day==1) {
            System.out.println("You go to gym on Monday");
        } else if(day==2){
            System.out.println("You go to gym on Tuesday ");
        }else if(day==3){
            System.out.println("You go to gym on Wednesday");
        }else if(day==4){
            System.out.println("You go to gym on Thursday");
        }else if(day==5){
            System.out.println("You go to gym on Friday");
        }else if(day==6){
            System.out.println("You go to gym on Saturday");
        }else if(day==0){
            System.out.println("You go to gym on Sunday");
        }else{
            System.out.println("There is no such a day!");
        }
    }
}