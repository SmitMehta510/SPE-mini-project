package com.example.scientificcalculator;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Calculator {

    //TEST comment
    
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public void calculate() {
        log.info("Starting calculator");
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
                    log.info("Function selected : Square Root");
                    System.out.print("Enter the number to find its square root: ");
                    double sqrtInput = scanner.nextDouble();
                    result = Math.sqrt(sqrtInput);
                    log.info("Square root of " + sqrtInput + " is " + result);
                    break;
                case 2:
                    log.info("Function selected : Factorial");
                    System.out.print("Enter the number to find its factorial: ");
                    int factorialInput = scanner.nextInt();
                    result = factorial(factorialInput);
                    log.info("Factorial of " + factorialInput + " is " + result);
                    break;
                case 3:
                    log.info("Function selected : Natural Log");
                    System.out.print("Enter the number to find its natural logarithm: ");
                    double logInput = scanner.nextDouble();
                    result = Math.log(logInput);
                    log.info("Natural Log of " + logInput + " is " + result);
                    break;
                case 4:
                    log.info("Function selected : Exponent");
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    log.info(base + " raised to " + exponent + " is " + result);
                    break;
                case 5:
                    log.info("Function selected : Addition");
                    System.out.print("Enter the first number: ");
                    double addInput1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double addInput2 = scanner.nextDouble();
                    result = addInput1 + addInput2;
                    log.info("Addition of " + addInput1 + " and " + addInput2 + " is " + result);
                    break;
                case 6:
                    log.info("Function selected : Subtraction");
                    System.out.print("Enter the first number: ");
                    double subInput1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double subInput2 = scanner.nextDouble();
                    result = subInput1 - subInput2;
                    log.info("Subtraction of " + subInput1 + " and " + subInput2 + " is " + result);
                    break;
                case 7:
                    log.info("Function selected : Multiplication");
                    System.out.print("Enter the first number: ");
                    double mulInput1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double mulInput2 = scanner.nextDouble();
                    result = mulInput1 * mulInput2;
                    log.info("Multiplication of " + mulInput1 + " and " + mulInput2 + " is " + result);
                    break;
                case 8:
                    log.info("Function selected : Division");
                    System.out.print("Enter the numerator: ");
                    double divInput1 = scanner.nextDouble();
                    System.out.print("Enter the denominator: ");
                    double divInput2 = scanner.nextDouble();
                    result = divInput1 / divInput2;
                    log.info("Division of " + divInput1 + " and " + divInput2 + " is " + result);
                    break;
                case 0:
                    log.info("Exiting Calculator...");
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Result: " + result);
        }
    }
}

