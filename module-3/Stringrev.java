import java.util.Scanner;
public class Stringrev {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String input= sc.nextLine();
        String output="";
        for(int i=input.length()-1;i>=0;i--){
            output+=input.charAt(i);
        }
        System.out.println("The reversed string is "+output);
        sc.close();
    }
}
