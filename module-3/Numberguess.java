import java.util.Random;
import java.util.Scanner;
public class Numberguess {
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,attempt=0,guess=0;
        Random r=new Random();
        n=r.nextInt(100);
        while(guess!=n){
            System.out.println("Enter your guess:");
            guess=sc.nextInt();
            attempt++;
            if(guess<n){
                System.out.println("Too low,Try again");
            } else if (guess>n) {
                System.out.println("Too high,Try again");

            }
            else{
                System.out.println("Correct number");
                System.out.println("Taken attempts: "+attempt);
            }



        }
        sc.close();




    }

}
