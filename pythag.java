import java.util.Scanner;

class pythag {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      System.out.println("what is a?");
      int a = sc.nextInt();
      System.out.println("What is b?");
      int b = sc.nextInt();
      double c= Math.sqrt((a*a)+(b*b));
      System.out.println("c="+c);
      
    }

}
