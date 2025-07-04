import java.util.Scanner;
public class TryandCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the numerator:");
            int n= sc.nextInt();
            System.out.println("Enter the denominator:");
            int d= sc.nextInt();
            float div=n/d;
            System.out.println("The answer is "+div);
        }
        catch (ArithmeticException e){
            System.out.println("Error:Divison by zero");

        }
        sc.close();

    }
}
