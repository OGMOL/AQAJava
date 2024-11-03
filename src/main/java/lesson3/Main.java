package lesson3;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
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
}
