
import java.util.Scanner;

public class Tut4 {

    public static void main(String[] args) {

        System.out.println("Calculator");

        Scanner input = new Scanner(System.in);//--object of Scanner 

        System.out.println("Enter the case you want"); 

        System.out.println("Case 1--Addition\nCase 2--subtraction\nCase 3--Multiplication");
        System.out.println("case 4--Division\nCase 5--Square root\nCase 6--Positive and Negative number");
        System.out.println("Case 7--Find maximum and minimumm number\n");

        int num = input.nextInt();

        switch (num) {

            case 1:
             

                System.out.println("enter the value A");

                double a = input.nextDouble();

                System.out.println("Enter the  value B");

                Double b = input.nextDouble();

                System.out.println("Addition");

                System.out.println(a + b);

                break;

            case 2:
               

                System.out.println("enter the value A\n");

                double c = input.nextDouble();

                System.out.println("Enter the  value B\n");

                Double d = input.nextDouble();

                System.out.println("subtraction");
                System.out.println(d - c);
                break;

            case 3:

                System.out.println("Multiplication");
                System.out.println("enter the value A");

                double x = input.nextDouble();
                System.out.println("enter the value B");

                double z =input.nextDouble();

               System.out.println(x*z);
                
              

                break;

            case 4:

                System.out.println("Division");
                System.out.println("Enter your value");

                System.out.printf("enter the value A/\n");

                double f = input.nextDouble();

                System.out.println("Enter the  value B\n");

                Double g = input.nextDouble();
                System.out.println(f / g);

                break;

            case 5:

                System.out.println("square root");
                System.out.printf("enter the value A\n");

                double h = input.nextDouble();

                System.out.println(Math.sqrt(h));

                break;
            case 6:

                System.out.println("POSITIVE AND NEGATIVE NUMBER");

                System.out.printf("enter the value A\n");

                double i = input.nextDouble();

                if (i < 0) {

                    System.out.println("the number is negative");
                } else {
                    System.out.println("the number is positve");
                }

                break;

            case 7:

                System.out.println(" Maximum number and Mininmum number ");

                System.out.println("For maximum number press 1\n For minimumm number press 2");

                int val = input.nextInt();

                switch (val) {
                    case 1:

                        System.out.println("Enter the value of number A");

                        Double j = input.nextDouble();

                        System.out.println("Enter the value of number B");

                        Double k = input.nextDouble();

                        System.out.println("Maximum number=" + Math.max(j, k));

                        break;
                    case 2:

                        System.out.println("Enter the value of number A");

                        Double l = input.nextDouble();

                        System.out.println("Enter the value of number B");

                        Double m = input.nextDouble();

                        System.out.println("Minimum number=" + Math.min(l, m));
                }
                break;

            default:

                break;

        }

    }

}
