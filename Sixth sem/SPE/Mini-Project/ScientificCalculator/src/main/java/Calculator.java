package Calculator
import java.util.*;
import java.lang.Math;

public class Calculator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("User menu option: \n 1.Square root function \n 2. Factorial function \n 3. Natural Logarithm(base e) \n 4. Power function \n");
        int option = 0;
        try{
            option = sc.nextInt();
        } catch (InputMismatchException error) {
            //wrong input
            System.out.print("Wrong input for selecting the options. Kindly choose from 1,2,3,4 \n");
        }

        Calculator obj = new Calculator();
        //user options
        if(option==1)
        {
            //Takes only numbers >= 0
            //Error handling done, returns NaN if negative number
            System.out.print("Enter the number for which you wish to calculate: \n");
            double num = sc.nextDouble();

            System.out.println("Square root of " + num + " is " + obj.sq_root(num));
        }
        else if(option==2)
        {
            //Takes only integer as input
            System.out.print("Enter the number for which you wish to calculate: \n");
            int num = sc.nextInt();

            if (num < 0)
            {
                System.out.print("Factorial of a negative number is not defined. \n");
            }
            else
            {
                System.out.println("Factorial of " + num + " is " + obj.factorial(num));
            }
        }
        else if(option==3)
        {
            //Negative no. -> NaN, 0 -> -Infinity, Infinity -> Infinity
            System.out.print("Enter the number for which you wish to calculate: \n");
            double num = sc.nextDouble();

            System.out.println("Natural Logarithm(base e) of " + num + " is " + obj.log(num));
        }
        else if(option==4)
        {
            System.out.print("Enter the number for which you wish to calculate: \n");
            double num = sc.nextDouble();

            System.out.print("Enter the exponent number: \n");
            double exp = sc.nextDouble();
            System.out.println("Power of " + num + " is " + obj.power(num, exp));
        }
        else{
            System.out.print("Wrong input for selecting the options. Kindly choose from 1,2,3,4 \n");
        }

    }

    public int factorial(int n)
    {
        int res = 1;
        for(int i=2; i<=n; i++)
        {
            res = res*i;
        }
        return res;
    }

    public double sq_root(double n)
    {
        double ans = Math.sqrt(n);
        return ans;
    }

    public double log(double n)
    {
        double ans = Math.log(n);
        return ans;
    }

    public double power(double a, double b)
    {
        double ans = Math.pow(a,b);
        return ans;
    }
}
