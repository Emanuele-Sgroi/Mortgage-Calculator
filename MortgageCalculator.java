/*
Title: Mortgage Calculator
Type: Terminal Only
Author: Emanuele Sgroi
Description:
   This small project is made with the purpose of my own practise only.
   The "Mortgage Calculator Formula" has been taken from online resources and imported
   in this Java Application.
 How it works:
   This application works directly on the terminal.
   Follow the instructions and answer all the questions that the program
   will run for you.
   The morgage calculator will actually calculate the real monthly payment for you
   based on the information you will give to it.
 */
package mortgage.calculator;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author emanu
 */
public class MortgageCalculator {
    public static void main(String[] args) {
        // Asking name
        System.out.println("Hi! \nWhat is your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print your name here: ");
        String name = scanner.nextLine().trim();
        // Asking Name end
        
        // Instructions
        System.out.println(" ");
        System.out.println("Nice to meet you " + name + "!!!");
        System.out.println("I understood that you would like to know how much your mortgage will be");
        System.out.println("NO PROBLEMS!!!\nI am here to help you\nI just need few information from you.");
        System.out.println("Please answer the questions below...");
        // Instructions end
        
        // constant vars
        final byte MONTHS = 12;
        final byte PERCENT = 100;
        // constants var end
        
        //info
        System.out.print(" ");
        System.out.print("Property Price(£): ");
        int PROPERTY_PRICE = scanner.nextInt();
        System.out.print("Deposit(£): ");
        int DEPOSIT = scanner.nextInt();
        int PRINCIPAL = PROPERTY_PRICE - DEPOSIT;
        System.out.println("Your Mortgage Request is " + "£" + PRINCIPAL);
        System.out.println("Let me ask few more questions");
        System.out.print(" ");
        
       
        System.out.print("INTEREST RATE (ANNUAL): ");
        double INTEREST = scanner.nextDouble();
         System.out.print("Period (years): ");
        int PERIOD = scanner.nextInt();
       
        System.out.println(" ");
        System.out.println("THANK YOU, let me make the math for you! ");
        System.out.println(" ");
        //info end
        
        //Calculation
        double r = (double)INTEREST / PERCENT / MONTHS;       
        int n = PERIOD * MONTHS;
        double r1 = r + 1;
        double r2 = r1 * n;
        double FINAL_INTEREST = r2 * r;
        double MORTGAGE_TOTAL = PRINCIPAL * FINAL_INTEREST;
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);
        String MONTHLY_MORTGAGE = currency.format(MORTGAGE_TOTAL / PERIOD / MONTHS);
        double INT_VALUE = MORTGAGE_TOTAL - PRINCIPAL;
       
        //Calculation ends
        
        //PRINT RESULT
       
        System.out.println("Your Mounthly Ammount to pay is: " + MONTHLY_MORTGAGE);
        System.out.println(" ");
        System.out.println("Thank you " + name + " for using this MORTGAGE CALCULATOR\nGOOD LUCK!!!");
        
        
    }
    
}
