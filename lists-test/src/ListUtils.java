
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;


public class ListUtils {

    // BEGIN (write your solution here)
    static <L> ArrayList<L> filter(List<L> list1, Predicate<L> pd) {
        ArrayList<L> result = new ArrayList<>();
        for (var value : list1) {
            if (pd.test(value)) {
                result.add(value);
            }
        }
        return result;
    }
    // END
}
