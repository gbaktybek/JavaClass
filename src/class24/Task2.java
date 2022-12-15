package class24;
//Write a program to print the sum of each COLUMN from a 2D array
//Example
//Array:
//{23, 44, 21},
//{45, 42, 31},
//{73, 14, 0}
public class Task2 {
    public static void main(String[] args) {

        int[][] num = {{23,44,21},{45,42,31},{73,14,0}};

        for(int i=0;i<num.length;i++){
            int sum=0;
            for(int j=0;j<num[i].length;j++){
                sum=sum+num[j][i];
            }
            System.out.println(sum);
        }

    }
}
