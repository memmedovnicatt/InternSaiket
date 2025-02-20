package first_task;

import java.util.Scanner;

public class CalculatorTask {
    public static void UserInput() {
        System.out.println("Welcome to Calculator Application");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.print("Please choose one operation: ");
            int operation = scanner.nextInt();

            if (operation == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }


            System.out.print("Enter first number:");
            double number1 = scanner.nextDouble();
            System.out.print("Enter second number:");
            double number2 = scanner.nextDouble();


            double result = 0;

            switch (operation) {
                case 1:
                    result = addMethod(number1, number2);
                    break;
                case 2:
                    result = subMethod(number1, number2);
                    break;
                case 3:
                    result = multipleMethod(number1, number2);
                    break;
                case 4:
                    try {
                        result = divisionMethod(number1, number2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Please choose between 1-5.");
                    continue;
            }
            System.out.println("Result= " + result);
        }
    }

    public static double addMethod(double number1, double number2) {
        return number1 + number2;
    }

    public static double subMethod(double number1, double number2) {
        return number1 - number2;
    }

    public static double multipleMethod(double number1, double number2) {
        return number1 * number2;
    }

    public static double divisionMethod(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("You can not divide by zero");
        }
        return number1 / number2;
    }

    public static void showMenu() {
        System.out.print("Menu: ");
        String menu = "1.Addition" +
                " 2.Subtraction" +
                " 3.Multiplication" +
                " 4.Division" +
                " 5.Exit";
        System.out.println(menu);
    }
}