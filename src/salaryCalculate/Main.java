package salaryCalculate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000, 45, 1985);
        employee.printInfo();
        employee.tax();
        employee.bonus();
        employee.taxBonus();
        employee.salaryIncrease();
        employee.total();


    }
}
