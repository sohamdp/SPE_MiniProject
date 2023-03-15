package org.example;

import java.util.Scanner;

public class Calculator
{
    public double sqrt(double x)
    {
        double result=0;
        try
        {
            if(x<0)
            {
                result=Double.NaN;
                throw new ArithmeticException("square root of negative number is not possible");
            }
            else
            {
                result=Math.sqrt(x);
            }
        }
        catch (ArithmeticException error)
        {
            System.out.println(error.getLocalizedMessage());
        }
        return result;

    }
    public double factorial(double x)
    {
        return fact(x);
    }
    public double fact(double x)
    {
        Integer temp=1;
        for(Integer i=1;i<=x;i++)
        {
            temp=i*temp;
        }
        return temp;
    }
    public  double logarithm(double x)
    {
        double result=0;
        try
        {
            if(x<=0)
            {
                result=Double.NaN;
                throw new ArithmeticException("Natural Log for 0 and negative number is not possible");
            }
            else
            {
                result=Math.log(x);
            }
        }
        catch (ArithmeticException error)
        {
            System.out.println(error.getLocalizedMessage());
        }
        return result;
    }
    public double power_function(double x1,double x2)
    {
        double result=0;
        try
        {
            if(x1==0 && x2==0)
            {
                result=Double.NaN;
                throw new ArithmeticException("Pow(0,0) is not possible");
            }
            else
            {
                result=Math.pow(x1, x2);
            }
            return result;
        }
        catch (ArithmeticException error)
        {
            System.out.println(error.getLocalizedMessage());
        }
        return result;
    }
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num,num1;
        System.out.println("\n*******************MiniProject********************\n");
        char ch;
        do {
            System.out.println("1.Square root function : √x");
            System.out.println("2.Factorial function : x!");
            System.out.println("3.Natural logarithm (base е) : ln(x)");
            System.out.println("4.Power function : xb");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter Number:");
                    num = scanner.nextDouble();
                    System.out.println("Square root of " + num + " is " + calculator.sqrt(num));
                    break;
                case 2:
                    System.out.print("Enter Number:");
                    num = scanner.nextDouble();
                    System.out.println("Factorial of " + num + " is " + calculator.factorial(num));
                    break;
                case 3:
                    System.out.print("Enter Number:");
                    num = scanner.nextDouble();
                    System.out.println("Natural log of " + num + " is " + calculator.logarithm(num));
                    break;
                case 4:
                    System.out.print("Enter base Number:");
                    num = scanner.nextDouble();
                    System.out.print("Enter power for Base:");
                    num1=scanner.nextDouble();
                    System.out.println("Natural log of " + num + " is " + calculator.power_function(num,num1));

            }
            System.out.print("Do you want to continue(y/n):");
            ch = scanner.next().charAt(0);
        } while (ch == 'y');

    }

}