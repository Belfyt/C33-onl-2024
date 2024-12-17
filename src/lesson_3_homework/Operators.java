package lesson_3_homework;
import java.util.Scanner;
class Operators {
    public static void main(String[] args) {
        getTaskOne();
        getTaskTwo();
        getTaskThree();
        getTaskFour();
        getTaskStar();
    }

    public static void getTaskOne() {
        System.out.println("-------------------------Задание 1--------------------------");
        System.out.println("Введите число: ");
        int Value = new Scanner(System.in).nextInt();
        if (Value % 2 == 0)
            System.out.println(Value + " - четное число");
        if (Value % 2 != 0)
            System.out.println(Value + " - нечетное число");

    }

    public static void getTaskTwo() {
        System.out.println("-------------------------Задание 2--------------------------");
        System.out.println("Введите число: ");
        int Value = new Scanner(System.in).nextInt();
        if (Value > -5)
            System.out.println("Warm");
        if (Value > -20 && Value <= -5)
            System.out.println("Normal");
        if (Value <= -20)
            System.out.println("Cold");
    }

    public static void getTaskThree() {
        System.out.println("-------------------------Задание 3--------------------------");
        System.out.println("Введите число: ");
        for (int Value = 10; Value <= 20; Value++) {
            int Square = Value * Value;
            System.out.println("Квадрат числа " + Value + " равен " + Square);
        }
    }

    public static void getTaskFour() {
        System.out.println("-------------------------Задание 4--------------------------");
        int Value = 7;
        while (Value <= 98) {
            System.out.println(Value + "");
            Value +=7;

        }
    }
    public static void getTaskStar() {
        System.out.println("-------------------------Задание *--------------------------");
        System.out.println("Введите число: ");
        int Value = new Scanner(System.in).nextInt();
        if (Value > 0) {
            int sum = 0;
            int Addition = 1;
            while (Addition <= Value) {
                sum += Addition;
                Addition++;
            }
            System.out.println("Сумма всех цифр до и включая " + Value + " равна " + sum);
        } else {
            System.out.println("Некорректное число");

        }
    }

}