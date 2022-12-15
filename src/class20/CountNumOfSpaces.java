package class20;

public class CountNumOfSpaces {
    public static void main(String[] args) {

        String str = "Hello User, How are you?";

        System.out.println(getNumberOfSpaces(str));
    }

//    static int getNumberOfSpaces(String str) {
//
//        for (int i = 0; i <= str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//        return 0;
//
//        }

    static int getNumberOfSpaces(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;

    }
}

