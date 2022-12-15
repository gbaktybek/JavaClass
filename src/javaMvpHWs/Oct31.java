package javaMvpHWs;

import java.util.Scanner;

public class Oct31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name= scan.nextLine();
        System.out.println("Which class are you going to attend right now?");
        String className = scan.nextLine();

        String[] studentList={"Guldana","Kang","Aigul","Aisuluu","Asel","Begaiym","Charlie","Jadia","Kanykei","Kristo","Maggie","Nevaeh","Tayfun","Tetiana"};

        String[] classList = {"Group Project","Java","Git","Soft skills","Linux"};

        for ( int i=0; i<studentList.length;i++){
            if( name.equalsIgnoreCase(studentList[i])){
                if(className.equalsIgnoreCase(classList[0])){
                    System.out.println("Welcome to class!");
                }else if(className.equalsIgnoreCase(classList[1])){
                    System.out.println("There is no Java Class today");
                }else if(className.equalsIgnoreCase(classList[2])){
                    System.out.println("There is no Git Class today");
                }else if(className.equalsIgnoreCase(classList[3])){
                    System.out.println("There is no Soft Skills Class today");
                }else if(className.equalsIgnoreCase(classList[4])){
                    System.out.println("There is no Linux Class today");
                }else{
                    System.out.println("There is no such Class");
                }
            }else{
                if(className.equalsIgnoreCase(classList[0]) ){
                    System.out.println("You are not in Java-MVP. Join your group for the project.");
                }else if(className.equalsIgnoreCase(classList[1])){
                    System.out.println("There is no Java Class today");
                }else if(className.equalsIgnoreCase(classList[2])){
                    System.out.println("There is no Git Class today");
                }else if(className.equalsIgnoreCase(classList[3])){
                    System.out.println("There is no Soft Skills Class today");
                }else if(className.equalsIgnoreCase(classList[4])){
                    System.out.println("There is no Linux Class today");
                }else{
                    System.out.println("There is no such Class");
                }
            }
        }
    }
}
