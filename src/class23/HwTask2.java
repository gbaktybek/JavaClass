package class23;

public class HwTask2 {
    public static void main(String[] args) {

        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};

        for (int i = 0; i < data.length - 1; i++) {
            int count=0;
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(data[i]);
            }
        }

    }
}
