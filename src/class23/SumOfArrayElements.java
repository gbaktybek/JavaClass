package class23;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] data = {23,44,21,23,23,35,35,44,35};

        int sum=0;
        for(int i:data){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
