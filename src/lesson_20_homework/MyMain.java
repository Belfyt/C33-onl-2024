package lesson_20_homework;
import java.util.Arrays;
import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Thread maxThread = new Thread(() -> {
            int max = Integer.MIN_VALUE;
            for (int value : array) {
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("Максимальное значение в массиве: " + max);
        });

        Thread minThread = new Thread(() -> {
            int min = Integer.MAX_VALUE;
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
            }
            System.out.println("Минимальное значение в массиве: " + min);
        });

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }

    public static void taskTwo() {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        int[] array1 = array.clone();
        int[] array2 = array.clone();
        int[] array3 = array.clone();

        Thread t1 = new Thread(() -> insertionSort(array1));
        Thread t2 = new Thread(() -> selectionSort(array2));
        Thread t3 = new Thread(() -> bubbleSort(array3));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Insertion Sort: ");
        printArray(array1);
        System.out.println("Selection Sort: ");
        printArray(array2);
        System.out.println("Bubble Sort: ");
        printArray(array3);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}




