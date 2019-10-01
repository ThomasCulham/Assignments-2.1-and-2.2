import java.util.Scanner;

class GradeCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("What was the test out of?");
        int OO = sc.nextInt();
        System.out.println("what did you get?");
        double score = sc.nextInt();
        double percent= score/OO*100;
        System.out.println(percent+"%");
        if(percent>85){
            System.out.print("(A)");
        }else if(percent>72){
            System.out.print("(B)");
        }else if(percent>66){
            System.out.print("(C+)");
        }else if(percent>59){
            System.out.print("(C)");
        }else if(percent>49){
            System.out.print("(C-)");
        }else{
            System.out.print("(F)");
        }

    }
}
