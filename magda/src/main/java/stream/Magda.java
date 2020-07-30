package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Magda {
    public static void main(String[] args) {

        List<String> magda = new ArrayList<>();
        magda.add("Magda");
        magda.add("Basia");
        magda.add("Bartek");
        magda.add("Asia");

        magda.forEach(k-> System.out.println(k)); // = system.out:: println
        magda.stream().filter(name->name.startsWith("Ba")).forEach(name-> System.out.println(name));

        magda.add(null);
        for(String name : magda){
//            if(name != null)
//            System.out.println(name.length());

            var x = Optional.ofNullable(name).orElse("empty");
            System.out.println(x.length());
        }
    }


}
