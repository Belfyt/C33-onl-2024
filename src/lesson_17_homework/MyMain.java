package lesson_17_homework;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class MyMain {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
    }

    public static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате ГГГГ-ММ-ДД:");
        String value = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate hundredYearsDate = birthDate.plusYears(100);
        System.out.println("Дата, когда вам исполнится 100 лет: " + hundredYearsDate);
    }

    public static void taskTwo() {
        List<Integer> numbers = Arrays.asList(-10, 15, -20, 30, -5, 45, 0);
        Predicate<Integer> isPositive = num -> num > 0;
        List<Integer> positiveNumbers = numbers.stream().filter(isPositive).collect(Collectors.toList());
        System.out.println("Положительные числа: " + positiveNumbers);
    }

    public static void taskThree() {
        Scanner scanner = new Scanner(System.in);
        final double exchangeRate = 0.4;
        Function<String, Double> bynToUsd = str -> {
            double amountInByn = Double.parseDouble(str.split(" ")[0]);
            return amountInByn * exchangeRate;
        };
        String byn = scanner.nextLine();
        double amountInUsd = bynToUsd.apply(byn);
        System.out.println(byn + " равняется " + amountInUsd + " USD");
    }

    public static void taskFour() {
        Scanner scanner = new Scanner(System.in);
        final double exchangeRate = 0.4;
        Consumer<String> printUsdEquivalent = str -> {
            double amountInByn = Double.parseDouble(str.split(" ")[0]);
            double amountInUsd = amountInByn * exchangeRate;
            System.out.println(str + " равняется " + amountInUsd + " USD");
        };
        String byn = scanner.nextLine();
        printUsdEquivalent.accept(byn);
    }

    public static void taskFive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String value = scanner.nextLine();
        Supplier<String> reverseStringSupplier = () -> new StringBuilder(value).reverse().toString();
        System.out.println("Строка задом наперед: " + reverseStringSupplier.get());
    }
}
