import java.util.Scanner;
public class Recfibonnaci {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive number:");
        n=sc.nextInt();
        int res=fib(n);
        System.out.println("Fibonnaci at "+n+" is "+res);
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

}
