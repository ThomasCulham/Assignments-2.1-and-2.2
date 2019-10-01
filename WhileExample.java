import java.util.Scanner;
public class WhileExample {
 public static void main(String[] args) {
  int i=1;
  int r = 10;
  boolean run = true;
  
  while(i<=211000000){
    if(run){
       if(i%20==0){
           System.out.println(""+i);
         }else{
         System.out.print(""+i);
       }
       i++;
    }
   }
 }
}