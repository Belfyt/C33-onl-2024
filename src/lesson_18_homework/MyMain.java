package lesson_18_homework;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
public class MyMain {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(3);
        int sum = numbers.stream().distinct().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Сумма оставшихся элементов: " + sum);
    }

    public static void taskTwo() {
        Map<Integer, String> data = new HashMap<>();
        data.put(1, "Alice");
        data.put(2, "Bob");
        data.put(3, "Charlie");
        data.put(4, "David");
        data.put(5, "Eve");
        data.put(6, "Frank");
        data.put(8, "Grace");
        data.put(9, "Hannah");
        data.put(10, "Ian");
        data.put(13, "Judy");
        Set<Integer> validIds = new HashSet<>(Arrays.asList(1, 2, 5, 8, 9, 13));
        List<String> filteredNames = data.entrySet().stream()
                .filter(entry -> validIds.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());
        filteredNames.forEach(System.out::println);
    }
}
