package class23;

public class HwPractice2D {
    public static void main(String[] args) {

        int[][] num = new int[2][3];
        System.out.println(num[0].length);

        int data[] []= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(data[2][0]);
        System.out.println();

        for(int i=0; i< data.length;i++){
            for(int j=0;j<data[i].length;j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
