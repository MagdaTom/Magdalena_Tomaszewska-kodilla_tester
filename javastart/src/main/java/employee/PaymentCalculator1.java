package employee;

public class PaymentCalculator1 {
    private final static double MONTHLY_ZUS = 1000;

    public static double nettoYearPayment(Employee employee) {
        return employee.getSalary() * 12;
    }

    public static double bruttoYearPayment(Employee employee) {
        double nettoSalary = employee.getSalary();
        double bruttoSalary = nettoSalary * 0.2;
        return 12 * (nettoSalary  + bruttoSalary + MONTHLY_ZUS);
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski", 3000.00);
        double nettoYearPayment = PaymentCalculator1.nettoYearPayment(employee);
        double bruttoYearPayment = PaymentCalculator1.bruttoYearPayment(employee);
        System.out.println("Roczna wypłata netto: " + nettoYearPayment);
        System.out.println("Roczna wypłata brutto: " + bruttoYearPayment);
    }
}
