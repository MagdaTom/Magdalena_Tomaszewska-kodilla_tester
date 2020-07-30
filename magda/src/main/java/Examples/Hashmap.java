package Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {

        Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("Midhun");
        hashset1.add("Vinay");
        hashset1.add("Ajith");

        HashSet<String> hashset2 = new HashSet<String>();
        hashset2.add("Sooraj");
        hashset2.add("Vinay");
        hashset2.add("Vishnu");

        map.put("friends", hashset1);
        map.put("relatives", hashset2);

        for (Map.Entry<String, HashSet<String>> mapEntry : map.entrySet()) {
            System.out.println("Key :: " + mapEntry.getKey());
            for (String value : mapEntry.getValue()) {
                System.out.println("Value :" + value);
            }
            System.out.println("===================");
        }
    }
}
