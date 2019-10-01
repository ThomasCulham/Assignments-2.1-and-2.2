import java.util.Scanner;

class RandomDiceRoll {
    public static void main(String[] args){
      int i=0;
      while(i<10){
          
       int random = (int)(Math.random() * 6) + 1 ;
        if((i+1)%5==0 && i!=9){
         System.out.println(random + ",");
        }else if (i!=9){
         System.out.print(random + ",");
        } else {
         System.out.print(random + ".");
        }
       i++;
      }
    }

}
