package Java8StremsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class
StreamApiMapAndFlatmap {
    //Find list of employees whose name starts with alphabet A
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Neha", "Aman", "Rahul");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                });


        List<String> words = List.of("java", "stream");

        List<String[]> result = words.stream()
                .map(word -> word.split(""))
                .collect(Collectors.toList());

        List<String> letters = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());

        System.out.println(letters);
    }

}