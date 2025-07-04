import java.lang.reflect.*;

public class Reflection {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionDemo");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
            for (Parameter p : method.getParameters()) {
                System.out.println("  Param: " + p.getType().getSimpleName());
            }
        }

        Method sayHello = clazz.getDeclaredMethod("sayHello", String.class);
        sayHello.invoke(obj, "Reflection");
    }
}
