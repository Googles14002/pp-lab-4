import employees.Employee;
import employees.Worker;
import employees.Manager;


public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan A", 1000, 0);
        employees[1] = new Worker("Jan B", 2000, "HR");
        employees[2] = new Employee("Jan C", 3000);
        employees[3] = new Employee("Jan D", 4000);
        employees[4] = new Worker("Jan E", 5000, "Accountant");

        int nonManagersCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagersCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);
        }

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(20500);

        System.out.println("Dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}