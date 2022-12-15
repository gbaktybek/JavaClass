package javaMvpHWs;

public class StringPractice {
    public static void main(String[] args) {

        String url = "https://www.thespruce.com/thanksgiving-table-decor-ideas-52-5946";

        String urlWords = url.substring(url.lastIndexOf('/')+1);
        System.out.println(urlWords);

    }
}
