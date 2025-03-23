//Imports the Scanner class.
import java.util.Scanner;

public class wk9ex4
{
    public static void main(String[] args)
    {
        //Creates a new Scanner object called userInput.
        Scanner userInput = new Scanner(System.in);
        //Program title.
        System.out.println("WELCOME TO THE HYPOTENUSE CALCULATOR");
        //Styling.
        System.out.println("=====================================");
        //Prompts the user to enter the length of the first side.
        System.out.print("Please enter the length of the first side (a): ");
        //Declares a double variable called a and assigns it the value entered by the user.
        double a = userInput.nextDouble();
        //Prompts the user to enter the length of the second side.
        System.out.print("Enter the length of the second side (b): ");
        //Declares a double variable called b and assigns it the value entered by the user.
        double b = userInput.nextDouble();
        //Declares a variable and Calculates the length of the hypotenuse.
        double result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        //Alternative method to calculate the length of the hypotenuse.
        //double result = Math.sqrt((a * a) + (b * b));
        //Displays the result with 2 decimal places.
        System.out.println("The length of the hypotenuse is: " + String.format("%.2f", result));
        //Closes the Scanner object.
        userInput.close();

        //End of program message.
        System.out.println("\nThank you for using the hypotenuse calculator!\n"); 
        //Closes the Scanner object.

        //Pushed to GitHub Wk9ex4 Repository.
       



        

    }
}