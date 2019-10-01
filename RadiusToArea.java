import java.util.Scanner;

class RadiusToArea {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter the radius of the circle:");
      int radius = sc.nextInt();
      System.out.println("Area:" + Math.pow(radius,2)*Math.PI);
      
    }

}