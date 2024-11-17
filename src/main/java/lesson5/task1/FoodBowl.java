package lesson5.task1;

public class FoodBowl {
    private int food;

    /**
     * Конструктор
     */
    public FoodBowl(int initialFood) {
        this.food = initialFood;
    }

    public int getFood() {
        return food;
    }

    /**
     * Метод добавляет еду в миску
     */
    public void addFood(int amount) {
        food += amount;
        System.out.println("В миске " + food + " еды.");
    }

    /**
     * Метод проверяет достаточно ли еды в миске, если достаточно отнимает,
     * если нет, пишет, что еды недостаточно.
     */
    public void eat(int amount) {
        if (amount <= food) {
            food -= amount;
            System.out.println("Кот съел " + amount + " еды. Осталось " + food + " еды в миске.");
        } else {
            System.out.println("Недостаточно еды в миске. " + food + " еды осталось.");
        }
    }
}
