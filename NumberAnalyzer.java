
import java.util.Collections;
import java.util.List;

public class NumberAnalyzer {
    public static int min(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List must not be empty");
        }
        return Collections.min(numbers);
    }

    public static int max(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List must not be empty");
        }
        return Collections.max(numbers);
    }

    public static int sum(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("List must not be null");
        }
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static long mult(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("List must not be null");
        }
        return numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
    }
}
