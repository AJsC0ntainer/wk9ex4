import java.util.Scanner;

public class wk9ex4
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("WELCOME TO THE HYPOTENUSE CALCULATOR");
        System.out.println("=====================================");
        System.out.print("Please enter the length of the first side (a): ");
        double a = userInput.nextDouble();
        System.out.print("Enter the length of the second side (b): ");
        double b = userInput.nextDouble();
        double result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        //double result = Math.sqrt((a * a) + (b * b));
        System.out.println("The length of the hypotenuse is: " + String.format("%.2f", result));
        System.out.println("\nThank you for using the hypotenuse calculator!"); 

        userInput.close();

        

    }
}