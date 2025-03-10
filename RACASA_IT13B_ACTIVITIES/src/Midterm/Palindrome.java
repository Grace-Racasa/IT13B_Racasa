

package Midterm;

import java.util.Scanner;




public class Palindrome {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your word: ");
        String original = in.nextLine();
        
        String reversed = "";
        for (int i = original.length() - 1; i>=0; i--){
    
        reversed += original.charAt(i);
        
    }
        if(original. equalsIgnoreCase(reversed)){
            System.out.println("Your word is Palindrome.");
        }else{
            System.out.println("Your word is Not a Palindrome.");
        }
        
       in.close();
    }
}


