// Класс Employee
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}

// Класс NetSalaryCalculator
public class NetSalaryCalculator {
    private final double TAX_RATE = 0.25;

    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * TAX_RATE);
        return employee.getBaseSalary() - tax;
    }
} 

// Класс SalaryCalculator
public class SalaryCalculator {
    private final double TAX_RATE = 0.25;

    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * TAX_RATE);
        return baseSalary - tax;
    }
}