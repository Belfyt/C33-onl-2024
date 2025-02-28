package lesson_11_homework;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.String;
public class MyStrings {
    public static void main(String[] args) {
        getTaskOne();
        getTaskTwo();
        getTaskThree();
    }

    public static void getTaskOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String str3 = scanner.nextLine();
        String shortestString = str1;
        String longestString = str1;
        if (str2.length() < shortestString.length()) {
            shortestString = str2;
        }
        if (str3.length() < shortestString.length()) {
            shortestString = str3;
        }
        if (str2.length() > longestString.length()) {
            longestString = str2;
        }
        if (str3.length() > longestString.length()) {
            longestString = str3;
        }
        System.out.println("Самая короткая строка: " + shortestString + " длиной: " + shortestString.length());
        System.out.println("Самая длинная строка: " + longestString + " длиной: " + longestString.length());
    }

    public static void getTaskTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку");
        String str3 = scanner.nextLine();
        String shortestString = str1;
        String middleString = str1;
        String longestString = str1;


    }

    public static void getTaskThree(){
        String[] str = new String[3];
        System.out.println(str);
    }
}



