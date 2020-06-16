
public class Magda {
    public static void main(String[] args) {

    String name = "Magda";
    String secondName = "Magdalena      ";
        System.out.println(name.charAt(name.length() -1));
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,3));
        System.out.println(secondName);
        System.out.println(secondName.trim());
        System.out.println("Ze spacjami " + secondName + " .");
        System.out.println("Bez spacji: " + secondName.trim() + ".");
        System.out.println(name.toUpperCase());

        System.out.println(name.startsWith("A"));
        System.out.println(name.startsWith("Ma"));
        System.out.println(name.startsWith("MA"));
        System.out.println(secondName.toLowerCase().trim().startsWith("m"));
        System.out.println(secondName.endsWith(" "));
        System.out.println(secondName.contains("Magda"));
        System.out.println(secondName.replace('a', 'A'));
    }
}










