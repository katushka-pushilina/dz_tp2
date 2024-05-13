import java.util.Collections;
import java.util.List;

public class NumberAnalyzer {
    public static int _min(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static int _max(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static int _sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static long _mult(List<Integer> numbers) {
        return numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
    }
}
