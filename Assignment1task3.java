/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1task3;
import java.util.Scanner;
public class Assignment1task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a 4-digit Octal number: ");
        String octalnum = input.nextLine();
        char pos1 = octalnum.charAt(0);
        int value1 = ((int)pos1-(int)'0');
       
        char pos2 = octalnum.charAt(1);
        int value2 = ((int)pos2-(int)'0');
        
        char pos3 = octalnum.charAt(2);
        int value3 = ((int)pos3-(int)'0');
        
        char pos4 = octalnum.charAt(3);
        int value4 = ((int)pos4-(int)'0');
        
        double decimal1 = Math.pow(8,0)*value4;
        double decimal2 = Math.pow(8,1)*value3;
        double decimal3 = Math.pow(8,2)*value2;
        double decimal4 = Math.pow(8,3)*value1;
        double decimal = decimal1 + decimal2 + decimal3 + decimal4;
        System.out.printf("\n%-20s:%5s\n%-20s:%5.0f\n","Octal Number",octalnum,"Decimal Number",decimal);
        
        
    }
    
}
