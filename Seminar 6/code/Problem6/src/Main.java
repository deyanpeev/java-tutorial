import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("name 1", "Ivan", "Gosho", "Toshok", "Van");

        //filter out names containing "name"
        names.stream().filter(n -> !n.contains("name")).forEach(System.out::println);

        //sort by length
        names.stream().filter(n -> !n.contains("name")).sorted((n1, n2) -> n1.length() - n2.length() ).forEach(System.out::println);
    }
}