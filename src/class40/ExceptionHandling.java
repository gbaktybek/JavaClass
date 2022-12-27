package class40;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {

    }

    public static void method1() throws FileNotFoundException {

        throw new FileNotFoundException("Hello! You got exception");
    }
}
