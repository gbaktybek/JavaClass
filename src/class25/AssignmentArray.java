package class25;
//write a program to find length of each word from the string
//output:
//today - 5
//is - 2
//Monday, - 7
//it - 2
//started - 7
//well - 4
public class AssignmentArray {
    public static void main(String[] args) {
        String str = "Today is Monday, it started well";

        String[] words = str.split(" ");

        for( String word : words){
            System.out.println(word + "-" + word.length());
        }
    }
}
