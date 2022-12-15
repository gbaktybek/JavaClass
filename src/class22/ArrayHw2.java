package class22;

//Write a program to find the greatest number
//Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//Output : Maximum - 75
public class ArrayHw2 {
    public static void main(String[] args) {

        int[] num = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        int greatestNum = 0;

        for(int i: num){
            if(i>greatestNum){
                greatestNum=i;
            }
        }
        System.out.println(greatestNum);
    }
}
