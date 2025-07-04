public class Sample {
    public String greet(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(new Sample().greet("World"));
    }
}
