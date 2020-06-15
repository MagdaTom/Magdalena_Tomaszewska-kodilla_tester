public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;

        System.out.println(year);
        if (isLeap(year))
            System.out.println("Rok przestępny");
        else
            System.out.print("Rok nie przestępny");

    }

    private static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);


    }

}
