package class17;

public class LoopEx4 {
    public static void main(String[] args) {

        for (int i=1; i<=7; i++){
            for(int s=1; s<=7-i;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("A");
            }
            System.out.println();

        }
    }
}
