package com.revature;

import java.util.Scanner;

//Summons calculator for specific integral

public class IntegralList 
{   Scanner choice = new Scanner(System.in);



    public void display()
    {   System.out.println("Select Integral to calculate Integrands");
        System.out.println("Please enter Integral id number");
        int c = choice.nextInt();
        Calculator calc = new Calculator();
        if (c == 1)
        {   System.out.println("Please enter 'a' constant");
            double a = choice.nextDouble();
            System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral1(a, n1, n2));
        }
        else if (c == 2)
        {   System.out.println("Please enter exponent value");
            System.out.println("Please enter an integer for exponent");
            int n = choice.nextInt();
            System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral2(n, n1, n2));
        }
        else if (c == 3)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral3(n1, n2));
        }
        else if (c == 4)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral4(n1, n2));
        }
        else if (c == 5)
        {   System.out.println("Please enter constant 'a' value");
            double a = choice.nextDouble();
            System.out.println("Please enter exponent lower value");
            System.out.println("Please enter an integer for exponent");
            int m1 = choice.nextInt();
            System.out.println("Please enter exponent upper value");
            System.out.println("Please enter an integer for exponent");
            int m2 = choice.nextInt();
            System.out.println("\nResult is: " + calc.Integral5(a, m1, m2));
        }
        else if (c == 6)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral6(n1, n2));
        }
        else if (c == 7)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral7(n1, n2));
        }
        else if (c == 8)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral8(n1, n2));
        }
        else if (c == 9)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral9(n1, n2));
        }
        else if (c == 10)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral10(n1, n2));
        }
        else if (c == 11)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral11(n1, n2));
        }
        else if (c == 12)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral12(n1, n2));
        }
        else if (c == 13)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral13(n1, n2));
        }
        else if (c == 14)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral14(n1, n2));
        }
        else if (c == 15)
        {   System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral15(n1, n2));
        }
        else if (c == 16)
        {   System.out.println("Please enter 'a' constant");
            double a = choice.nextDouble();
            System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral16(a, n1, n2));
        }
        else if (c == 17)
        {   System.out.println("Please enter 'a' constant");
            double a = choice.nextDouble();
            System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral17(a, n1, n2));
        }
        else if (c == 18)
        {   System.out.println("Please enter 'a' constant");
            double a = choice.nextDouble();
            System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral18(a, n1, n2));
        }
        else if (c == 19)
        {   System.out.println("Please enter 'a' constant");
            double a = choice.nextDouble();
            System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral19(a, n1, n2));
        }
        else if (c == 20)
        {   System.out.println("Please enter 'a' constant");
            double a = choice.nextDouble();
            System.out.println("Please enter lower value");
            double n1 = choice.nextDouble();
            System.out.println("Please enter upper value");
            double n2 = choice.nextDouble();
            System.out.println("\nResult is: " + calc.Integral20(a, n1, n2));
        }
        else      
        {   System.out.println("Sorry, that integral either is not in this database ");
            System.out.println("or its calculator has not been set up yet");
        }
    }
}
