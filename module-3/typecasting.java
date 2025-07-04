public class typecasting {
    public static void main(String[] args) {
        double myDouble = 9.99;
        int myInt = (int) myDouble;
        System.out.println("Double value: " + myDouble);
        System.out.println("After casting to int: " + myInt);
        int anotherInt = 10;
        double anotherDouble = (double) anotherInt;
        System.out.println("Integer value: " + anotherInt);
        System.out.println("After casting to double: " + anotherDouble);
    }
}
