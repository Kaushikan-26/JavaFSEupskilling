import java.util.Scanner;
public class table {
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a numer to generate multiplication table:");
        n=sc.nextInt();
        System.out.println("Table for "+n);
        for (int i=1;i<11;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }

        sc.close();
    }

}
