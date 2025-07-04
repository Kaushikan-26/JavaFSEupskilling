public class overloading {
    public static void main(String[] args){
        int n1=100,n2=200,n3=300;
        double d1=123.45,d2=678.90;
        int m1=odd(n1,n2);
        System.out.println("Answer from method 1: "+m1);
        double m2=odd(d1,d2);
        System.out.println("Answer from method 2: "+m2);
        int m3=odd(n1,n2,n3);
        System.out.println("Answer from method 3: "+m3);

    }
    public static int odd(int n1,int n2){
        return n1+n2;
    }
    public static  double odd(double d1,double d2){
        return d1+d2;
    }
    public static int odd(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
