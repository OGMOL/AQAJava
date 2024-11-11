package lesson5.task2;

public class Circle implements Shape{
    private double radius;
    private String fillColor;
    private String borderColor;

    /**
     * Конструктор
     */
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    /**
     * Метод считает площадь круга
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод считает периметр круга
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Метод возвращает цвет фона круга
     */
    @Override
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Метод возвращает цвет границ круга
     */
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
