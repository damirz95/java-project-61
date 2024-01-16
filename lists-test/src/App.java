import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        var fruits = new ArrayList<>(List.of("apple", "lemon", "pear", "avocado", "mango"));
        var expected = List.of("apple", "avocado");
        var actual = ListUtils.filter(fruits, e -> e.startsWith("a"));
        System.out.println(actual);
        String val = "O";
        val.charAt(0);
    }
}

