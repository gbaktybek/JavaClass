package class13;

import java.util.Scanner;

public class Task1CelsiusFahrenheit {

    static double celsiusToFahrenheit(double c){
        double f;
        f= (c * 9 / 5) + 32;
        f= Math.round(f);
        return f;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give temperature in Celsius");
        double celsius = scan.nextDouble();

        System.out.println("Temperature in Fahrenheit = " + celsiusToFahrenheit(celsius));


    }
}
