
package Midterm;

public class Racasa_DelaCruz_Array {
   public static void main(String[]args){
       
       char[] RacasaDelaCruz = {'A', 'B', 'C', 'D', 'E', 'F','G'};
       
       for (int i = 0; i <RacasaDelaCruz.length; i++){
           System.out.print(RacasaDelaCruz[i]);
           
           if (i < RacasaDelaCruz.length - 1){
                System.out.print("  ");
           }
       }
   }
   }

