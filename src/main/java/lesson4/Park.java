package lesson4;

public class Park {

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        /**
         * Конструктор
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
}
