package lesson4;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Ivan", "Ivanov", "engineer", "ivanovivan@gmail.com", "+375257532255", new BigDecimal(3000), 50);
        employeeArr[1] = new Employee("Petr", "Petrov", "accountant", "petrovpetr@gmail.com", "+375335454555", new BigDecimal(2500), 27);
        employeeArr[2] = new Employee("Andrey", "Andreev", "hr specialist", "andreevandrey@gmail.com", "+375447242245", new BigDecimal(3300), 29);
        employeeArr[3] = new Employee("Sergey", "Sergeev", "doctor", "sergeevsergey@gmail.com", "+375256696969", new BigDecimal(3000), 40);
        employeeArr[4] = new Employee("Vasiley", "Vasiliev", "driver", "ivanovivan@gmail.com", "+375337899898", new BigDecimal(3100), 33);

        for (Employee e : employeeArr) {
            e.printInfo();
        }

        employeeArr[2].printInfo();

        Park park = new Park();
        park.addAttraction("Американские горки", "10:00 - 20:00", 4.5);
        park.addAttraction("Бамперные машины", "9:30 - 21:00", 4.0);
        park.addAttraction("Колесо обозрения", "9:00 - 21:00", 5.0);
        park.printAllAttractions();
    }

}
