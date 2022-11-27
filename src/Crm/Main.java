package Crm;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Customer customer = new Customer();
        System.out.println(customer.id);
        System.out.println(employee.firstName);

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        employeeManager.List();
    }


}
