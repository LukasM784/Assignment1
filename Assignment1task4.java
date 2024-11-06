/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1task4;
import java.util.Scanner;
public class Assignment1task4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter the initial balance: $");
        double balance  = input.nextDouble();
        
        System.out.print("Please enter the annual interest rate: ");
        double rate  = input.nextDouble();
        
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        double years  = input.nextDouble();
        
        double afteryears = balance*Math.pow(1+(rate/100), years);
        
        System.out.printf("\n%-25s:%10.2f\n%-25s:%9.2f%%\n%-25s:%10.0f\n","Initial Amount",balance,"Annual Intrest Rate",rate,"Saving Years",years);
        System.out.print("-------------------------------------");
        System.out.printf("\n%s %.0f %-9s:%10.2f\n","Balance After",years,"Years",afteryears);
    }
    
}
