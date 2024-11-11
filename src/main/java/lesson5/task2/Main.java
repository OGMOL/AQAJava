package lesson5.task2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(25, "Желтый", "Черный");
        Shape rectangle = new Rectangle(80, 200, "Синий", "Белый");
        Shape triangle = new Triangle(12, 10, 13, "Серый", "Красный");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
