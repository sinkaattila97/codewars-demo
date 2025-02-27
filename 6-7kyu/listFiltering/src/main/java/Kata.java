import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .map(e -> (Integer) e)
                .collect(Collectors.toList());
    }
}