import java.util.Scanner;

public class ConverterHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("pls enter Temp in Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsiusToKelvin(celsius);
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " temp in C = " + kelvin + " temp in K");
        System.out.println(celsius + " temp in C = " + fahrenheit + " temp in F");

        scanner.close();
    }

    public static double celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }
}
