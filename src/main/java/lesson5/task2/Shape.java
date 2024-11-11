package lesson5.task2;

public interface Shape {

    /**
     * Метод для расчета площади
     */
    double area();

    /**
     * Метод для расчета периметра
     */
    double perimeter();

    /**
     * Метод для получения цвета фона
     */
    String getFillColor();

    /**
     * Метод для получения цвета границ
     */
    String getBorderColor();

    /**
     * Дефолтный метод для вывода информации о фигуре
     */
    default void printInfo() {
        System.out.println("Площадь: " + area());
        System.out.println("Периметр: " + perimeter());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
    }
}
