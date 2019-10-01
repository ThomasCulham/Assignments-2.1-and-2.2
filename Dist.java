import java.util.Scanner;

class Dist {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter X coordinate of point 1:");
      int x1 = sc.nextInt();
      System.out.println(x1);
      System.out.println("Enter Y coordinate of point 1:");
      int y1 = sc.nextInt();
      System.out.println("Enter X coordinate of point 2:");
      int x2 = sc.nextInt();
      System.out.println("Enter y coordinate of point 2:");
      int y2 = sc.nextInt();
      System.out.println("The distance betwene the points is "+  Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)) + " units.");
      
    }

}
