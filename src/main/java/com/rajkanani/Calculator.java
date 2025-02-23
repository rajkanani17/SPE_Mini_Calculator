package com.rajkanani;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        while(true) {
            System.out.println("<------- Menu for Calculator ------->");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm (base e) - ln(x)");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();

            if(choice == 5){
                System.out.println("End of Execution");
                break;
            }

            if(choice > 5 || choice < 0){
                System.out.println("Enter Valid Choice");
                continue;
            }

            System.out.println("Enter operand : ");
            int a = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println(sqrt(a));
                    break;
                case 2:
                    System.out.println(fact((int) a));
                    break;
                case 3:
                    System.out.println(ln(a));
                    break;
                case 4:
                    System.out.println("Enter Second operand");
                    double b = sc.nextDouble();
                    System.out.println("Answer : " + power(a, b));
                    break;
            }
        }
    }

    // ------- Square Root -------
    public static double sqrt(double x) {
        if (x < 0) {
            return Double.NaN;
        }
        double result = Math.sqrt(x);
        return result;
    }

    // ------- Factorial -------
    public static long fact(int x) {
        if (x < 0) {
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    // ------- Natural Logarithm -------
    public static double ln(double x) {
        if (x <= 0) {
            return Double.NaN;
        }
        double result = Math.log(x);
        return result;
    }

    // ------- Power Function -------
    public static double power(double x, double y) {
        double result = Math.pow(x, y);
        return result;
    }
}