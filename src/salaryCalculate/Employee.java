package salaryCalculate;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    int salaryIncrease;
    double taxBonus;
    double total;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = tax;
        this.salaryIncrease = salaryIncrease;
    }

    void printInfo() {
        System.out.println("Name:\t\t" + this.name);
        System.out.println("Salary:\t\t" + this.salary);
        System.out.println("Work Hours:\t" + this.workHours);
        System.out.println("Hire Year:\t" + this.hireYear);

    }

    void tax() {
        this.tax = (this.salary * 0.03);
        System.out.println("Tax:\t\t" + this.tax);
    }

    void bonus() {
        this.bonus = (2022 - hireYear) * 5;
        System.out.println("Bonus:\t\t" + this.bonus);
    }

    void salaryIncrease() {
        this.salaryIncrease = (2022 - hireYear) * 10;
        System.out.println("Increase:\t\t" + this.salaryIncrease);
    }

    void taxBonus() {
        this.taxBonus = this.salary + (this.bonus - this.tax);
        System.out.println("Tax and Bonus:\t" + this.taxBonus);
    }

    void total() {
        double total = this.salary + this.salaryIncrease;
        System.out.println("Total:" + total);
    }
}
