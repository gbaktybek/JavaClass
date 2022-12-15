package class22;

//Write a program to find all duplicates number from the array
//Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
//Output : Duplicate numbers - 23, 44
public class ArrayHw3 {
    public static void main(String[] args) {

        int[] num = {23, 44, 21, 23, 27, 35, 75, 44, 25};

        for ( int i=0; i<num.length;i++){
            for( int j=i+1; j<num.length;j++){
                if(num[i]==num[j] && i!=j){
                    System.out.println(num[j]);
                }
            }
        }
    }
}
