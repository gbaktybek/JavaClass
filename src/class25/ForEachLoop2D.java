package class25;

public class ForEachLoop2D {
    public static void main(String[] args) {
        int[][] data = {
                {23,44,21},
                {45,42,31},
                {73,14,0}
        };

        for( int row[]: data){
            for(int num : row){
                System.out.println(num);
            }
        }
    }
}