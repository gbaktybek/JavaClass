package class19;

public class HwEx {
    public static void main(String[] args) {

        for (int i=1; i<=5;i++){
            for(int s1=1; s1<6-i; s1++){
                System.out.print("*");
            }
            for(int num=1; num<=i*2-1; num++){
                System.out.print(num);
            }
            for(int s2=1; s2<=6-i; s2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
