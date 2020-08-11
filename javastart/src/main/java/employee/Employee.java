package employee;

public class Employee {
    String name;
    String lastName;
    Double salary;

    //Napisz program, który będzie się składał z kilku klas.
    //
    //Employee - reprezentuje pracownika, powinna posiadać co najmniej pola do przechowywania imienia, nazwiska i miesięcznej pensji
    //PaymentCalculator - kalkulator płac, który posiada metodę nettoYearPayment i bruttoYearPayment.
    // Obie metody powinny przyjmować jako argument obiekt typu Employee.
    // Pierwsza zwraca roczną sumę wypłat danego pracownika,
    // natomiast druga zwraca roczną sumę wypłat wraz z dodatkowymi podatkami (ZUS, podatki do urzędu skarbowego).
    // Dla uproszczenia przyjmujemy, że miesięczny koszt ZUS to 1000zł a podatek dochodowy wynosi 20%.

    public Employee(String name, String lastName, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }
}
