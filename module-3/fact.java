import java.util.Scanner;
public class fact {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=0,fact=1;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=2;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("Factorial of "+n+" is "+fact);
        sc.close();
    }
}
