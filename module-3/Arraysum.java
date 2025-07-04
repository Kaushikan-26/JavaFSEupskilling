import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        int n;
        System.out.println("Enter the no.of elements:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+"velement:");
            arr[i]=sc.nextInt();
        }

        int sum=0;
        float avg;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+avg);
        sc.close();
    }
}
