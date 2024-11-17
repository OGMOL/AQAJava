package lesson6;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] arr2 = {
                {"1", "2", "3", "4", "5"},
                {"5", "6", "7", "8", "9"},
                {"9", "10", "11", "12", "13"},
                {"13", "14", "15", "16", "17"}
        };
        String[][] arr3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "Z", "X", "C"},
                {"13", "14", "15", "16"}
        };
        testArray(arr);
        testArray(arr2);
        testArray(arr3);
    }

    private static void testArray(String[][] array) {
        try {
            int result = ArraySumCalculator.sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
