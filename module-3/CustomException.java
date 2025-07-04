import java.util.Scanner;
public class CustomException {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       try {
           System.out.println("Enter your Age:");
           int age=sc.nextInt();
           if(age<18){
               throw new Invalidage("Age must be grater than 18");
           }
           else {
               System.out.println("Access granted");
           }
       }
       catch (Invalidage e){
           System.out.println("Error:"+e.getMessage());
       }
       sc.close();

    }
}
class Invalidage extends Exception{
    public Invalidage(String msg){
        super(msg);
    }
}
