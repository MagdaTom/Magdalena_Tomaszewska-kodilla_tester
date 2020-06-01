public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;

        System.out.println(year);

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Rok przestępny");
        }
        else if (year %4 == 0 && year%100 == 0 && year%400 == 0){
            System.out.print("Rok przestępny");
        }
        else{
            System.out.print("Rok nie przestępny");
        }
    }
}