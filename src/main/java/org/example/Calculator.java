package org.example;

import java.util.Scanner;

public class Calculator
{
    public double sqrt(double x)
    {
        return Math.sqrt(x);
    }
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************MiniProject********************\n");
        char ch;
        do {
            System.out.println("1.Square root function - √x");
            System.out.println("2.Factorial function - x!");
            System.out.println("3.Natural logarithm (base е) - ln(x)");
            System.out.println("4.Power function - xb");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter Number:");
                    Double num = scanner.nextDouble();
                    System.out.println("Square root of " + num + " is " + calculator.sqrt(num));
            }
            System.out.print("Do you want to continue:(y/n):");
            ch = scanner.next().charAt(0);
        } while (ch == 'y');

    }

}