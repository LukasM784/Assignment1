/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1task2;
import java.util.Scanner;

public class Assignment1task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the item price: ");
        double price = input.nextDouble();
        
        System.out.print("Please enter the discount ratio(5 for 5%): ");
        double discount = input.nextInt();
       
        double discountamount = (discount*0.01)*price;
        double pricebeforetax = price - discountamount;
        double federaltax = pricebeforetax*0.05;
        double provincialtax = pricebeforetax*0.0975;
        double finalprice = pricebeforetax + federaltax + provincialtax;
        System.out.printf("\n%-20s:%.2f \n%-20s:%.2f%% \n%-20s:%.2f\n","Original Price",price,"Discount Price",discount,"Price Before Tax",pricebeforetax);
        System.out.print("-----------------------------------------");
        System.out.printf("\n%-20s:%.2f \n%-20s:%.2f \n%-20s:%.2f","Federal Tax",federaltax,"Provincial Tax",provincialtax,"Final Price",finalprice);
        
    }
    
}
