public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jan A", 1000);
        employees[1] = new Employee("Jan B", 2000);
        employees[2] = new Employee("Jan C", 3000);
        employees[3] = new Employee("Jan D", 4000);
        employees[4] = new Employee("Jan E", 5000);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(20500);

        System.out.println("Dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}