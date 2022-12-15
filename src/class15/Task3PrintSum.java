package class15;

public class Task3PrintSum {
    //Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
    public static void main(String[] args) {

        int sum1=0;

        for ( int i=1; i<=10; i++ ){
            if( i%3==0 ){
               sum1-=i;
            }else{
                sum1+=i;
            }
        }

        System.out.println(sum1);
    }
}
