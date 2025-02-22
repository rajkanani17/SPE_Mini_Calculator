package com.rajkanani;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        while(true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number");
            int a = sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();

            System.out.println("Enter Option of your Operation");
            int op = sc.nextInt();

            if(op == 1) {
                System.out.println(a + b);
            }
            else if(op == 2) {
                System.out.println(a - b);
            }
            else if(op == 3) {
                System.out.println(a * b);
            }
            else if(op == 4) {
                try{
                    System.out.println(a / b);
                }catch(ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } else if (op == 5) {
                break;
            }
            else {
                System.out.println("Invalid Choice");
            }
        }
    }
}