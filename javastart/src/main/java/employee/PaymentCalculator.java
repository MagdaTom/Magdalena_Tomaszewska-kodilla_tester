package employee;

public class PaymentCalculator {

    public double nettoYearPayment(Employee employee){
      return employee.getSalary() * 12;
    }

    public double bruttoYearPayment(Employee employee){
        double ZUS = 1000 * 12;
        double TAX = employee.getSalary() * 0.2;
        //return employee.getSalary() * 12 + ZUS + 12 * TAX;
        return 12 * (employee.getSalary() + TAX) + ZUS;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Magda", "Toma", 3000.00);
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        System.out.println(paymentCalculator.nettoYearPayment(employee));
        System.out.println(paymentCalculator.bruttoYearPayment(employee));

    }
}
