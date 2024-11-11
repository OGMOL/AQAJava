package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        /**
         * Конструктор класса Attraction
         */
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        /**
         * Метод внутреннего класса Attraction, выводящий информацию об аттракционах, времени их работы и стоимости.
         */
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " рублей");
            System.out.println("----------------------------");
        }
    }

    /**
     * Список аттракционов, который принадлежит классу Park
     */
    private ArrayList<Attraction> attractions = new ArrayList<>();

    /**
     * Метод для добавления аттракционов
     */
    public void addAttraction(String name, String workingHours, double price) {
        Attraction attraction = new Attraction(name, workingHours, price);
        attractions.add(attraction);
    }

    /**
     * Метод для вывода информации об аттракционах
     */
    public void printAllAttractions() {
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }
}

