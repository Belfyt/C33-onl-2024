package lesson_5_homework;
import java.util.Random;
import java.util.Scanner;
public class MultiArray {
    public static void main(String[] args) {
        getTaskOne();
        getTaskTwo();
        getTaskThree();
    }
    public static void getTaskOne() {
            int rows = 3, cols = 3;
            int[][] array = new int[rows][cols];
            Random random = new Random();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = random.nextInt(100);
                }
            }

            System.out.println("Исходный массив:");
            printArray(array);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число для добавления к каждому элементу массива: ");
            int valueToAdd = scanner.nextInt();

            int totalSum = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] += valueToAdd;
                    totalSum += array[i][j];
                }
            }
            System.out.println("Массив после добавления значения:");
            printArray(array);
            System.out.println("Сумма всех элементов массива: " + totalSum);
        }

        private static void printArray ( int[][] array){
            for (int[] row : array) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    public static void getTaskTwo() {
        final String WHITE = "\u001B[37mW\u001B[0m";
        final String BLACK = "\u001B[30mB\u001B[0m";
        int size = 8;
        String[][] board = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = WHITE;
                } else {
                    board[i][j] = BLACK;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void getTaskThree() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        System.out.print("Введите число m: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = num++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    array[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}

