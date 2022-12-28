package class40;

import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
    public static void main (String[] args) throws IOException{
        openBrowser();
    }

    public static void openBrowser() throws IOException {
        Scanner scan = new Scanner(System.in);
        String browser = scan.nextLine();

        if (browser.equals("Chrome")) {
            System.out.println("Opening Chrome");
        } else if (browser.equals("Firefox")) {
            System.out.println("Opening Firefox");
        } else {
            throw new IOException("Invalid Browser");
        }
    }
}
