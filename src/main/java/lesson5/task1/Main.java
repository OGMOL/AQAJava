package lesson5.task1;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Cat cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10;
        Cat[] catsArr = new Cat[]{cat1 = new Cat(), cat2 = new Cat(),
                cat3 = new Cat(), cat4 = new Cat(), cat5 = new Cat(), cat6 = new Cat(),
                cat7 = new Cat(), cat8 = new Cat(), cat9 = new Cat(), cat10 = new Cat()
        };

        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Всего собак: " + Dog.getCount());
        System.out.println("Всего котов: " + Cat.getCount());

        dog1.run(400);
        dog1.swim(11);

        cat1.run(150);
        cat1.swim(5);

        FoodBowl bowl = new FoodBowl(5);
        bowl.addFood(2);

        for (Cat cat : catsArr) {
            cat.eat(bowl);
            System.out.println("Кот сыт? " + cat.isFull());
        }
    }
}
