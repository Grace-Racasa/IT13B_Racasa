
package Midterm;

public class Racasa_DelaCruz_Multi_Dimen {
     public static void main(String[]args){
         int[][]RacasaDelaCruz = {
             {1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12}
                 
          
         };
       
         
         for (int i = 0; i < RacasaDelaCruz.length; i++){
             System.out.print("The Elements in Row " + (i+1) + " : ");
             
         for(int j = 0; j < RacasaDelaCruz[i].length; j++){
             System.out.print(RacasaDelaCruz[i][j]+ "  ");
         }
         
         System.out.println();
         
         }
     }  
}
