package com.example.scientificcalculator;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class ScientificCalculatorApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ScientificCalculatorApplication.class, args);
//        log.info("Starting Spring Boot Application...");
//        log.debug("Spring Boot Application...");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function (√x)");
            System.out.println("2. Factorial function (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Addition");
            System.out.println("6. Subtraction");
            System.out.println("7. Multiplication");
            System.out.println("8. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            double result = 0;
            switch (choice) {
                case 1:
                    System.out.print("Enter the number to find its square root: ");
                    double sqrtInput = scanner.nextDouble();
                    result = Math.sqrt(sqrtInput);
                    break;
                case 2:
                    System.out.print("Enter the number to find its factorial: ");
                    int factorialInput = scanner.nextInt();
                    result = factorial(factorialInput);
                    break;
                case 3:
                    System.out.print("Enter the number to find its natural logarithm: ");
                    double logInput = scanner.nextDouble();
                    result = Math.log(logInput);
                    break;
                case 4:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    break;
                case 5:
                    System.out.print("Enter the first number: ");
                    double addInput1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double addInput2 = scanner.nextDouble();
                    result = addInput1 + addInput2;
                    break;
                case 6:
                    System.out.print("Enter the first number: ");
                    double subInput1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double subInput2 = scanner.nextDouble();
                    result = subInput1 - subInput2;
                    break;
                case 7:
                    System.out.print("Enter the first number: ");
                    double mulInput1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double mulInput2 = scanner.nextDouble();
                    result = mulInput1 * mulInput2;
                    break;
                case 8:
                    System.out.print("Enter the numerator: ");
                    double divInput1 = scanner.nextDouble();
                    System.out.print("Enter the denominator: ");
                    double divInput2 = scanner.nextDouble();
                    result = divInput1 / divInput2;
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Result: " + result);
        }
    }

    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

}
