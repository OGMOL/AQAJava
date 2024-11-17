package lesson5.task1;

public class Cat extends Animal {
    private static int count = 0;
    private boolean isFull = false;

    /**
     * Счетчик котов
     */
    public Cat() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    /**
     * Реализация абстрактного метода run класса Animal для котов (Переопределение)
     */
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать " + distance + " м.");
        }
    }

    /**
     * Реализация абстрактного метода swim класса Animal для котов (Переопределение)
     */
    @Override
    public void swim(int distance) {
        System.out.println("Кот не может плавать.");
    }

    /**
     * Метод позволяющий коту есть из миски
     */
    public void eat(FoodBowl bowl) {
        if (bowl.getFood() > 0) {
            isFull = true;
            bowl.eat(1);
            System.out.println("Кот поел, теперь он сыт.");
        } else {
            System.out.println("В миске недостаточно еды, кот не ел.");
        }
    }

    /**
     * Метод возращает сыт ли кот
     */
    public boolean isFull() {
        return isFull;
    }
}
