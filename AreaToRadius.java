import java.util.Scanner;

class AreaToRadius {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter the area of the circle:");
      int area = sc.nextInt();
      System.out.println("Radius:" + Math.sqrt(area/Math.PI));
      
    }

}
