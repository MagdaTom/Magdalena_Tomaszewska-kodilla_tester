import org.w3c.dom.ls.LSOutput;

public class MyNumber {
    /*Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
MyNumber isOdd() – true jeśli atrybut jest nieparzysty,
MyNumber isEven() – true jeśli atrybut jest parzysty,
MyNumber sqrt() – pierwiastek z atrybutu,
MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
*/
    private double number;

    public MyNumber(double number){
        this.number = number;
    }

    public boolean isOdd(){
        return ! isEven();
    }

    public boolean isEven(){
        return this.number % 2 ==0;
    }

     public double sqrt(){ //pierwiastek z atrybutu
        return Math.sqrt(number);
    }

    public MyNumber pow(MyNumber pow){
      return new MyNumber(Math.pow(number, pow.number));
  }

    public MyNumber add(MyNumber otherNumber){
        return new MyNumber(number + otherNumber.number);
    }
    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(9);

        System.out.println(myNumber.isEven());
        System.out.println(myNumber.isOdd());
        System.out.println(myNumber.add(myNumber));
    }


}
