package lesson6;

public class ArraySumCalculator {
    /**
     * Метод для подсчета суммы элементов двумерного массива строк.
     */
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4.");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удается преобразовать в число", i, j);
                }
            }
        }
        return sum;
    }
}
