package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

//    Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case)
//    and have exactly 3 letters
public List<String> search(List<String> list) {
    return list.stream()
            .filter(a-> a.startsWith("a"))
            .filter(b-> b.length() == 3)
            .collect(Collectors.toList());
}


}
