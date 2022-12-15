package class04;

public class StringExample {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Everyone";
        int num1=23;
        int num2=7;

        //Concatenation
        System.out.println(str1+str2); //HelloEveryone
        System.out.println(str1+" "+str2); //Hello Everyone
        System.out.println(str1+num1); //Hello23
        System.out.println(str1+num1+num2);//Hello237 /Whatever comes first, executed first
        System.out.println(str1+(num1+num2));//Hello30
        System.out.println(str1+num1*num2);//Hello161
        System.out.println(num2-num1+str1);//-16Hello
        //System.out.println(str1+num1-num2); error!


    }
}
