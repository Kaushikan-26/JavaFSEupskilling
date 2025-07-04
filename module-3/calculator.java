import java.util.Scanner;

public class calculator {

    public static void main(String[] args){
        int n1,n2,ch;
        int sum,diff,mul=0;
        float div=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        n1=sc.nextInt();
        System.out.println("Enter number 2:");
        n2=sc.nextInt();
        System.out.println("1.Addition\n2.Subraction\n3.Multiplication\4.Division");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:
              sum=n1+n2;
              System.out.println(n1+"+"+n2+"="+sum);
              break;
            case 2:
              diff=n1-n2;
              System.out.println(n1+"-"+n2+"="+diff);
              break;
            case 3:
              mul=n1*n2;
              System.out.print(n1+"*"+n2+"="+mul);
              break;
            case 4:
              div=n1/n2;
              System.out.print(n1+"/"+n2+"="+div);
              break;
            default:
               System.out.println("Invalid choice");


        }
        sc.close();




    }


    
}
