package lesson3;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        positiveOrNegative(-22);
        System.out.println(isPositiveOrNegative(0));
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

}
