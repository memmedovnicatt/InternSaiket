package second_task;

import java.util.Scanner;

public class TemperatureConverter {
    public static void TemperatureConverterInput() {
        System.out.println("Welcome to Temperature Converter App");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.print("Please choose operation: ");
            int operation = scanner.nextInt();
            if (operation == 3) {
                System.out.println("Exiting the app. Goodbye!");
                break;
            }
            System.out.print("Into number: ");
            double number = scanner.nextDouble();
            double result = 0;
            switch (operation) {
                case 1:
                    result = celsiusToFahrenheit(number);
                    break;
                case 2:
                    result = fahrenheitToCelsius(number);
                    break;
                default:
                    System.out.println("Invalid operation! Please choose between 1-5.");
                    continue;
            }
            System.out.println("Result= " + result);

        }
    }

    public static void showMenu() {
        String menu = "1.Celsius to Fahrenheit" +
                " 2.Fahrenheit to Celsius" +
                " 3.Exit";
        System.out.println(menu);
    }

    public static double celsiusToFahrenheit(double number) {
        number = ((number * 9) / 5) + 32;
        return number;
    }

    public static double fahrenheitToCelsius(double number) {
        number = ((number - 32)) * 5 / 9;
        return number;
    }
}