package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        positiveOrNegative(-22);
        System.out.println(isPositiveOrNegative(0));
        printString("AstonJava", 5);
        System.out.println(isLeapYear(1000));
        replaceZerosAndOnes();
        fillArray();
        multiplyingLessThenSixArray();
        fillDiagonal();
        System.out.println(Arrays.toString(createArray(10,5)));
    }

    /**
     * Task1
     * Метод выводит три слова в столбец.
     */
    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    /**
     * Task2
     * Метод проверяет сумму двух переменных и выводит,
     * положительная или отрицательная сумма.
     */
    public static void checkSumSing() {
        int a = -2;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /**
     * Task3
     * Метод выводит цвет в зависимости от значения переменной value.
     */
    public static void printColor() {
        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /**
     * Task3
     * Метод сравнивает два числа и выводит результат сравнения.
     */
    public static void compareNumbers() {
        int a = 5;
        int b = 8;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /**
     * Task5
     * Метод проверяет, лежит ли сумма двух чисел в пределах от 10 до 20 (включительно).
     */
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /**
     * Task6
     * Метод проверяет, положительное или отрицательное число передано в качестве параметра.
     */
    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /**
     * Task7
     * Метод проверяет, является ли переданное число отрицательным.
     */
    public static boolean isPositiveOrNegative(int a) {
        return a < 0;
    }

    /**
     * Task8
     * Метод выводит переданную строку указанное количество раз.
     */
    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    /**
     * Task9
     * Метод определяет, является ли год високосным.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    /**
     * Task10
     * Метод создает массив, состоящий из 0 и 1, и заменяет 0 на 1, а 1 на 0.
     */
    public static void replaceZerosAndOnes() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    /**
     * Task11
     * Метод создает пустой целочисленный массив длиной 100 и заполняет его значениями от 1 до 100.
     */
    public static void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
    }

    /**
     * Task12
     * Метод задает массив и умножает числа меньше 6 на 2.
     */
    public static void multiplyingLessThenSixArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    /**
     * Task13
     * Метод создает квадратный двумерный целочисленный массив и заполняет диагональные элементы единицами.
     */
    public static void fillDiagonal() {
        int size = 5;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task14
     * Метод создает одномерный массив типа int заданной длины и заполняет его значением initialValue.
     */
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}
