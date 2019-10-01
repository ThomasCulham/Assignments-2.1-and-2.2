import java.util.Scanner;

class Interest {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      System.out.println("What did you initialy invest?");
      int initial = sc.nextInt();
      System.out.println(initial+"$");
      System.out.println("How many years has it been invested for?");
      int years = sc.nextInt();
      System.out.println(years +" years");
      System.out.println("What was the interest rate?");
      double rate = sc.nextInt();
      System.out.println(rate +"%");
      System.out.println("You have "+ (Math.pow(1+(rate/100),years))*initial + "$");
          
      
    }

}
