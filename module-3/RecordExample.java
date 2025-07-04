import java.util.*;
import java.util.stream.Collectors;

public class RecordExample {
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 17),
                new Person("Charlie", 25),
                new Person("Diana", 16)
        );

        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("All People:");
        people.forEach(System.out::println);

        System.out.println("\nAdults (18+):");
        adults.forEach(System.out::println);
    }
}
