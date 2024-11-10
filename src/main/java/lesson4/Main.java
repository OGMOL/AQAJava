package lesson4;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Ivan Ivanov Ivanovich", "engineer", "ivanovivan@gmail.com", "+375257532255", 3000,50);
        employeeArr[1] = new Employee("Petr Petrov Petrovich", "accountant", "petrovpetr@gmail.com", "+375335454555", 2500,27);
        employeeArr[2] = new Employee("Andrey Andreev Andreevich", "hr specialist", "andreevandrey@gmail.com", "+375447242245", 3300,29);
        employeeArr[3] = new Employee("Sergey Sergeev Sergeevich", "doctor", "sergeevsergey@gmail.com", "+375256696969", 3100,40);
        employeeArr[4] = new Employee("Vasiley Vasileyv Vasilevich", "driver", "ivanovivan@gmail.com", "+375337899898", 3000,33);

        for (Employee e : employeeArr) {
            e.printInfo();
        }

        employeeArr[2].printInfo();

        Park park = new Park();
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 20:00", 4.5);
        Park.Attraction bumperCars = park.new Attraction("Американские горки", "9:30 - 21:00", 4.5);
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "9:00 - 21:00", 5.0);

        rollerCoaster.printInfo();
        bumperCars.printInfo();
        ferrisWheel.printInfo();
    }

}
