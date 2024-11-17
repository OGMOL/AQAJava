package lesson6;

public class MyArrayDataException extends Exception {
    private final int row, col;

    public MyArrayDataException(String message, int row, int col) {
        super(message);
        this.row = row;
        this.col = col;
    }

    @Override
    public String getMessage() {
        return "Ошибка в ячейке [" + row + "][" + col + "]: " + super.getMessage();
    }
}
