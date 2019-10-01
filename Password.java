import java.util.Scanner;

class Password {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = new String("password");
        boolean unlocked= false;
        while(unlocked==false){
            System.out.println("What is the password?");
            String Input = sc.nextLine();
            if(password.equals(Input)){
                System.out.println("Access granted!! Go to this link to find my nudes:");
                System.out.println("https://TomHub.com");
                unlocked=true;
            }else{
                System.out.println("Wrong!!");
            }
        }
    }

}
