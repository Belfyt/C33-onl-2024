package lesson_4_homework;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
 class MyArray {
     public static void main(String[] args) {
         getTaskOne();
         getTaskTwo();
         getTaskTree();
         getTaskFour();
         getTaskFive();
         getTaskSix();
         getTaskStar();
     }

     public static void getTaskOne() {

         System.out.println("-----------------------Задание 1-----------------");
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         System.out.println("Введите размер массива");
         int size = scanner.nextInt();

         int[] array = new int[size];

         System.out.println("Выберите способ заполнения массива:");
         System.out.println("1. Ввести элементы вручную");
         System.out.println("2. Заполнить случайными числами");
         int method = scanner.nextInt();

         if (method == 1) {
             for (int i = 0; i < size; i++) {
                 System.out.print("Введите элемент " + (i + 1) + ": ");
                 array[i] = scanner.nextInt();
             }
         } else if (method == 2) {
             for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(100);
             }
         } else {
             System.out.println("Некорректный выбор!");
             return;
         }

         System.out.println("Элементы массива в прямом порядке:");
         for (int i = 0; i < size; i++) {
             System.out.print(array[i] + " ");
         }
         System.out.println();

         System.out.println("Элементы массива в обратном порядке:");
         for (int i = size - 1; i >= 0; i--) {
             System.out.print(array[i] + " ");
             System.out.println();
         }
     }

     public static void getTaskTwo() {
         System.out.println("--------------------------------Задание 2-----------------------");
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();

         System.out.print("Введите размер массива: ");
         int size = scanner.nextInt();
         int[] array = new int[size];

         System.out.println("Выберите способ заполнения массива:");
         System.out.println("1. Ввести элементы вручную");
         System.out.println("2. Заполнить случайными числами");
         int method = scanner.nextInt();

         if (method == 1) {
             for (int i = 0; i < size; i++) {
                 System.out.print("Введите элемент " + (i + 1) + ": ");
                 array[i] = scanner.nextInt();
             }
         } else if (method == 2) {
             for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(100);
             }
         } else {
             System.out.println("Некорректный выбор!");
             return;
         }

         System.out.println("Элементы массива в прямом порядке:");
         for (int num : array) {
             System.out.print(num + " ");
         }
         System.out.println();

         System.out.println("Элементы массива в обратном порядке:");
         for (int i = size - 1; i >= 0; i--) {
             System.out.print(array[i] + " ");
         }
         System.out.println();

         int min = array[0];
         int max = array[0];
         for (int num : array) {
             if (num < min) min = num;
             if (num > max) max = num;
         }

         System.out.println("Минимальный элемент: " + min);
         System.out.println("Максимальный элемент: " + max);
     }

     public static void getTaskTree() {
         System.out.println("-------------------------Задание 3-------------------------");
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         System.out.println("Введите размер массива");
         int size = scanner.nextInt();
         int[] array = new int[size];
         System.out.println("Выберите способ заполнения массива:");
         System.out.println("1. Ввести элементы вручную");
         System.out.println("2. Заполнить случайными числами");
         int method = scanner.nextInt();
         if (method == 1) {
             for (int i = 0; i < size; i++) {
                 System.out.print("Введите элемент " + (i + 1) + ": ");
                 array[i] = scanner.nextInt();
             }
         } else if (method == 2) {
             for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(100);
             }
         } else {
             System.out.println("Некорректный выбор!");
             return;
         }

         System.out.println("Элементы массива в прямом порядке:");
         for (int num : array) {
             System.out.print(num + " ");
         }
         System.out.println();

         System.out.println("Элементы массива в обратном порядке:");
         for (int i = size - 1; i >= 0; i--) {
             System.out.print(array[i] + " ");
         }
         System.out.println();

         int minIndex = 0;
         int maxIndex = 0;
         for (int i = 1; i < size; i++) {
             if (array[i] < array[minIndex]) {
                 minIndex = i;
             }
             if (array[i] > array[maxIndex]) {
                 maxIndex = i;
             }
         }

         System.out.println("Индекс минимального элемента: " + minIndex);
         System.out.println("Индекс максимального элемента: " + maxIndex);
     }

     public static void getTaskFour() {
         System.out.println("-------------------------Задание 4-------------------------");
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         System.out.println("Введите размер массива");
         int size = scanner.nextInt();
         int[] array = new int[size];
         System.out.println("Выберите способ заполнения массива:");
         System.out.println("1. Ввести элементы вручную");
         System.out.println("2. Заполнить случайными числами");
         int method = scanner.nextInt();
         if (method == 1) {
             for (int i = 0; i < size; i++) {
                 System.out.print("Введите элемент " + (i + 1) + ": ");
                 array[i] = scanner.nextInt();
             }
         } else if (method == 2) {
             for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(100);
             }
         } else {
             System.out.println("Некорректный выбор!");
             return;
         }

         System.out.println("Элементы массива в прямом порядке:");
         for (int num : array) {
             System.out.print(num + " ");
         }
         System.out.println();

         System.out.println("Элементы массива в обратном порядке:");
         for (int i = size - 1; i >= 0; i--) {
             System.out.print(array[i] + " ");
         }
         System.out.println();

         int zeroCount = 0;
         for (int num : array) {
             if (num == 0) {
                 zeroCount++;
             }
         }

         if (zeroCount > 0) {
             System.out.println("Количество нулевых элементов: " + zeroCount);
         } else {
             System.out.println("Нулевых элементов нет.");
         }
     }
     public static void getTaskFive() {
         System.out.println("-------------------------Задание 5-------------------------");
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         System.out.println("Введите размер массива");
         int size = scanner.nextInt();
         int[] array = new int[size];
         System.out.println("Выберите способ заполнения массива:");
         System.out.println("1. Ввести элементы вручную");
         System.out.println("2. Заполнить случайными числами");
         int method = scanner.nextInt();
         if (method == 1) {
             for (int i = 0; i < size; i++) {
                 System.out.print("Введите элемент " + (i + 1) + ": ");
                 array[i] = scanner.nextInt();
             }
         } else if (method == 2) {
             for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(100);
             }
         } else {
             System.out.println("Некорректный выбор!");
             return;
         }

         System.out.println("Элементы массива в прямом порядке:");
         for (int num : array) {
             System.out.print(num + " ");
         }
         System.out.println();

         for (int i = 0; i < size / 2; i++) {
             int temp = array[i];
             array[i] = array[size - 1 - i];
             array[size - 1 - i] = temp;
         }

         System.out.println("Массив после замены элементов:");
         for (int num : array) {
             System.out.print(num + " ");
         }
         System.out.println();
     }
     public static void getTaskSix() {
         System.out.println("-------------------------Задание 6-------------------------");
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         System.out.println("Введите размер массива");
         int size = scanner.nextInt();
         int[] array = new int[size];
         System.out.println("Выберите способ заполнения массива:");
         System.out.println("1. Ввести элементы вручную");
         System.out.println("2. Заполнить случайными числами");
         int method = scanner.nextInt();
         if (method == 1) {
             for (int i = 0; i < size; i++) {
                 System.out.print("Введите элемент " + (i + 1) + ": ");
                 array[i] = scanner.nextInt();
             }
         } else if (method == 2) {
             for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(100);
             }
         } else {
             System.out.println("Некорректный выбор!");
             return;
         }

         System.out.println("Элементы массива в прямом порядке:");
         for (int num : array) {
             System.out.print(num + " ");
         }
         System.out.println();

         boolean isIncreasing = true;
         for (int i = 1; i < size; i++) {
             if (array[i] <= array[i - 1]) {
                 isIncreasing = false;
                 break;
             }
         }

         if (isIncreasing) {
             System.out.println("Массив является возрастающей последовательностью.");
         } else {
             System.out.println("Массив не является возрастающей последовательностью.");
         }
     }
     public static void getTaskStar() {
         System.out.println("-------------------------Задание 6-------------------------");
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         System.out.println("Введите размер массива");
         int size = scanner.nextInt();
         int[] array = new int[size];
         System.out.println("Выберите способ заполнения массива:");
         System.out.println("1. Ввести элементы вручную");
         System.out.println("2. Заполнить случайными числами");
         int method = scanner.nextInt();
         if (method == 1) {
             for (int i = 0; i < size; i++) {
                 System.out.print("Введите элемент " + (i + 1) + ": ");
                 array[i] = scanner.nextInt();
             }
         } else if (method == 2) {
             for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(10);
             }
         } else {
             System.out.println("Некорректный выбор!");
             return;
         }

         System.out.println("Исходный массив: " + Arrays.toString(array));

          array = getTaskStar(array);

         System.out.println("Массив после добавления единицы: " + Arrays.toString(array));
     }

     private static int[] getTaskStar(int[] array) {
         int n = array.length;
         for (int i = n - 1; i >= 0; i--) {
             if (array[i] < 9) {
                 array[i]++;
                 return array;
             }
             array[i] = 0;
         }

         int[] newArray = new int[n + 1];
         newArray[0] = 1;
         return newArray;
     }
 }
















