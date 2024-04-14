import employees.Employee;
import employees.Worker;
import employees.Manager;


public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Jan A", 1000, 0);
        employees[1] = new Worker("Jan B", 2000, "HR");
        employees[2] = new Employee("Jan C", 3000);
        employees[3] = new Employee("Jan D", 4000);
        employees[4] = new Worker("Jan E", 5000, "Accountant");
        employees[5] = new Manager("Jan F", 6000, 0);
        employees[6] = new Worker("Jan G", 7000, "Marketing");

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(employees.length - 1);
                employee.setSalary(7500);
            } else {
                double newSalary = employee.getSalary() + 500;
                employee.setSalary(newSalary);
            }
        }
        System.out.println("Dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}