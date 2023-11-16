import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "   ", "Nahid", "Anders", "Eva");

        names.stream()
            .filter(Predicate.not(String::isBlank))
            .map(String::toUpperCase)
            // .map(String::length)
            .forEach(System.out::println);

        Stream<String> someStream = names.stream()
            .filter(Predicate.not(String::isBlank))
            .map(String::toUpperCase);

        someStream.forEach(System.out::println);


        Stream<String> s1 = names.stream();
        Stream<String> s2 = s1.filter(Predicate.not(String::isBlank));
        Stream<String> s3 = s2.map(String::toUpperCase);
        s3.forEach(System.out::println);


        List<Integer> lengths = names.stream().map(String::length).toList();
        System.out.println(lengths);
    }

    private static boolean notBlank(String s) {
        return ! s.isBlank();
    }
}
