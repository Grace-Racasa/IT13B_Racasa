/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prelim;
import java. util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab_exercise2 {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner (System.in);
        
     
               
               System.out.print(" Input First Number: ");
               int num1 = scanner.nextInt();
               
               System.out.print(" Input Second Number: ");
               int num2 = scanner.nextInt();
               
               System.out.print(" Input Third Number: ");
               int num3 = scanner.nextInt();
               
               int greatest = num1;
               if (num2 > greatest){
                   greatest = num2;
               }
               if (num3 > greatest){
                   greatest = num3;
               }
               System.out.println("The greatest number is: " + greatest);
               
               scanner.close();
             
               
               
               
               
       
               
               
               
               
          
    
    
}
    
}
