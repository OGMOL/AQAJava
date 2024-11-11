package lesson4;

import java.math.BigDecimal;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNumber;
    private BigDecimal salary;
    private int age;

    /**
     * Конструктор
     */
    public Employee(String firstName, String lastName, String position, String email, String phoneNumber, BigDecimal salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Метод, который выводит информацию об объекте в консоль
     */
    public void printInfo() {
        System.out.println("Фио: " + firstName);
        System.out.println("Фио: " + lastName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("----------------------------");
    }
}
