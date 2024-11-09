package lesson4;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Ivan Ivanov Ivanovich", "egeniar", "ivanovivan@gmail.com", "+375257532255", 3000,50);
        employeeArr[1] = new Employee("Ivan Ivanov Ivanovich", "egeniar", "ivanovivan@gmail.com", "+375257532255", 2500,50);
        employeeArr[2] = new Employee("Ivan Ivanov Ivanovich", "egeniar", "ivanovivan@gmail.com", "+375257532255", 3000,50);
        employeeArr[3] = new Employee("Ivan Ivanov Ivanovich", "egeniar", "ivanovivan@gmail.com", "+375257532255", 3000,50);
        employeeArr[4] = new Employee("Ivan Ivanov Ivanovich", "egeniar", "ivanovivan@gmail.com", "+375257532255", 3000,50);
        employeeArr[2].printInfo();
    }

}
