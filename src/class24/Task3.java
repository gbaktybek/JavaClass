package class24;
//Program to sort the elements of an array in ascending order (Same from the previous homework)
//Example
//Input : 5, 2, 8, 7, 3, 6
//Output : Duplicate numbers - 2, 3, 5, 6, 7, 8
public class Task3 {
    public static void main(String[] args) {

        int[] num = {5, 2, 8, 7, 3, 6};

        for(int i=0; i<num.length-1;i++){
            int count = 0;
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        for(int i:num){
            System.out.println(i);
        }
    }
}
