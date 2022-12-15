package class18;

public class Homework2MagicNum {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++){
            if(i%2==1 && i%3==2 && i%4==3 && i%5==4){
                System.out.println(i);
            }
        }
    }
}
