package class15;

public class Task1SumOfEven {
    //Java program to print the sum of even numbers from 1 to 10
    public static void main(String[] args) {

        int sum=0;
        for ( int i=1; i<=10; i++){
            if ( i%2==0 ) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
