import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("name 1", "Ivan", "Gosho", "Toshok", "Van");
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Ivan", 2);
        grades.put("Yordan", 6);

        names.stream().parallel().filter(n -> n.contains("name")).sorted().forEach(System.out::println);
        names.stream().forEach(n -> System.out.println(n));

        List<String> names2 = new ArrayList<>(Arrays.asList("Ivan", "Gosho", "Toshok", "Van"));
        names2.removeIf(n -> n.contains("I"));
        names2.forEach(n -> System.out.println(n));

        grades.forEach((String key, Integer value) -> { System.out.println(key + " " + value); } );

        //"Ivan", "Gosho" -> 4, 5

//        doSth((e) -> { String f = ""; return "Poof"; });
        //n ->  ""
        //n -> {return ""; }
    }

//    private static void doSth(Object a) {
//         return "dasdasd";
//    }
}