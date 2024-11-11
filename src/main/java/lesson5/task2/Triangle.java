package lesson5.task2;

public class Triangle implements Shape{
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    /**
     * Конструктор
     */
    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    /**
     * Метод считает площадь треугольника
     */
    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Метод считает периметр треугольника
     */
    @Override
    public double perimeter() {
        return a + b + c;
    }

    /**
     * Метод возвращает цвет фона треугольника
     */
    @Override
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Метод возвращает цвет границ треугольника
     */
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
