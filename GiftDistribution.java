package taskfive;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GiftDistribution {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Anna", "Alex", "Frank", "Amy", "George");

        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("All Students: " + studentNames);
        System.out.println("Students whose names start with 'a': " + studentsWithA);

        System.out.println("Special gifts will be given to the students whose names start with 'a'.");
    }
}

