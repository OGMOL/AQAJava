package lesson3;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    /**
     * Метод выводит три слова в столбец.
     */
    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    /**
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
}
