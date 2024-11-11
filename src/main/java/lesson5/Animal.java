package lesson5;

public abstract class Animal {
    private static int count =0;

    /**
     * Счетчик для всех животных
     */
    private Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    /**
     * Абстрактный метод для бега
     */
    public abstract void run(int distance);

    /**
     * Абстрактный метод для плавания
     */
    public abstract void swim(int distance);
}
