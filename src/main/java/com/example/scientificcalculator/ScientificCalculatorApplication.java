package com.example.scientificcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication

public class ScientificCalculatorApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ScientificCalculatorApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function (sqrt)");
            System.out.println("2. Factorial function (x!)");
            System.out.println("3. Natural logarithm (ln)");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double numberSqrt = scanner.nextDouble();
                    double sqrtResult = Math.sqrt(numberSqrt);
                    System.out.println("Square root of " + numberSqrt + " is " + sqrtResult);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int numberFact = scanner.nextInt();
                    long factorialResult = factorial(numberFact);
                    System.out.println("Factorial of " + numberFact + " is " + factorialResult);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double numberLn = scanner.nextDouble();
                    double lnResult = Math.log(numberLn);
                    System.out.println("Natural logarithm of " + numberLn + " is " + lnResult);
                    break;
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = scanner.nextDouble();
                    double powerResult = Math.pow(base, exponent);
                    System.out.println(base + " raised to the power of " + exponent + " is " + powerResult);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

}
