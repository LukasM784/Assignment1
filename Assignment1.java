/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;
import java.util.Scanner;

/**
 *
 * @author 6317922
 */
public class Assignment1 {
    public static void main(String[] args) {
       Scanner name = new Scanner(System.in);
       
       System.out.print("Please enter your name :");
       String yourname = name.nextLine();
       
       System.out.print("Please enter your age :");
       int yourage = name.nextInt();
       name.nextLine();
       System.out.print("Please enter your gender :");
       String yourgender = name.nextLine(); 
       
       System.out.print("Please enter your department :");
       String yourdepartment = name.nextLine();
       
       System.out.print("Please enter the value of pi(3.1415926) :");
       double pi = name.nextDouble();
       
       System.out.printf("\n %-14s:%s\n %-14s:%d \n %-14s:%s\n %-14s:%s \n %-14s:%.2f","Name",yourname,"Age",yourage,"Gender",yourgender,"Department",yourdepartment,"PI",pi);
        
    }
    
}
