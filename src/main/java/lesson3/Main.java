package lesson3;

import java.util.Arrays;

import static lesson3.Tasks.*;

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
        System.out.println(Arrays.toString(createArray(10, 5)));
    }
}
