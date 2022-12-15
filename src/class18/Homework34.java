package class18;

public class Homework34 {
    public static void main(String[] args) {

        for(int i=1; i<5; i++){
            for(int s1=1; s1<=5-i;s1++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print(j);
            }
            for(int s2=1; s2<=5-i;s2++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for(int s1=1; s1<=i-1;s1++){
                System.out.print(" ");
            }
            for(int j=1; j<=10-i*2+1; j++){
                System.out.print(j);
            }
            for(int s2=1; s2<=i-1;s2++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
