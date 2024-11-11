package lesson5.task2;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    /**
     * Конструктор
     */
    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    /**
     * Метод считает площадь прямоугольника
     */
    @Override
    public double area() {
        return length * width;
    }

    /**
     * Метод считает периметр прямоугольника
     */
    @Override
    public double perimeter() {
        return 2 * length + 2 * width;
    }

    /**
     * Метод возвращает цвет фона прямоугольника
     */
    @Override
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Метод возвращает цвет границ прямоугольника
     */
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
