public class SimpleArray {
    public static void main(String[] args) {
     String[] names = new String[5];
     names[0] = "Magda";
     names[1] = "Jacek";
     names[2] = "Janek";
     names[3] = "Agata";
     names[4] = "Dorota";

     String name = names[3];
     int numberOfElements = names.length;
     System.out.println(name);
     System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }
}
