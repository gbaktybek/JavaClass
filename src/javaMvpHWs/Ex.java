package javaMvpHWs;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String studentName = scan.nextLine();

        System.out.println(" which class are you going to attend right now?");
        String className = scan.nextLine();

        System.out.println(groupMVPorNot(studentName, className));
    }

    public static String groupMVPorNot(String a, String b) {

        if ((studnetList(a) == true) && b.equalsIgnoreCase("Group project")) {
            return "Welcome to the class!";

        } else if (studnetList(a) == true && b.equalsIgnoreCase("Java")) {
            return "There's no Java class today, you'll have it on Monday, Tuesday and Wednesday!";

        } else if ((studnetList(a) == true) && b.equalsIgnoreCase("Soft Skill")) {
            return "There's no soft skills class today, you'll have it on Saturday!";

        } else if ((studnetList(a) == true) && b.equalsIgnoreCase("Linux")) {
            return "There's no Linux class today, you'll have it on Friday!";


        } else if (studnetList(a) == false) {
            return "Please join your group, you're not a part of MVP!";

        } else {
            return "We don't have this class this week! ";
        }
    }


    static boolean studnetList(String a) {
        return a.equalsIgnoreCase("Kang") || a.equalsIgnoreCase("Aigul") || a.equalsIgnoreCase("Aisuluu") || a.equalsIgnoreCase("Asel") ||
                a.equalsIgnoreCase("Begaiym") || a.equalsIgnoreCase("Charlie") || a.equalsIgnoreCase("Guldana") || a.equalsIgnoreCase("Jadia")
                || a.equalsIgnoreCase("Kanykei") || a.equalsIgnoreCase("Kristo") || a.equalsIgnoreCase("Maggie") || a.equalsIgnoreCase("Nevaeh")
                || a.equalsIgnoreCase("Tayfun") || a.equalsIgnoreCase("Tetiana");

    }


}
