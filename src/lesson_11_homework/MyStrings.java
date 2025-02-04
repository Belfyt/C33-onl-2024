package lesson_11_homework;
import java.util.Scanner;
public class MyStrings {
    public static void main (String[] args){
        getTaskOne();
    }
    public static void getTaskOne(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String str3 = scanner.nextLine();

    }
}
