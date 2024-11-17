package lesson5.task1;

public class Dog extends Animal{

    private static int count = 0;

    /**
     * Счетчик собак
     */
    public Dog() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    /**
     * Реализация абстрактного метода run класса Animal для собак (Переопределение)
     */
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать " + distance + " м.");
        }
    }

    /**
     * Реализация абстрактного метода swim класса Animal для собак (Переопределение)
     */
    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть " + distance + " м.");
        }
    }
}
