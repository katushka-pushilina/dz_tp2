import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

public class NumberAnalyzerTest {
    @Test
    public void testMin() {
        assertEquals(1, NumberAnalyzer._min(Arrays.asList(1, 4, 2, 3)));
    }

    @Test
    public void testMax() {
        assertEquals(4, NumberAnalyzer._max(Arrays.asList(1, 4, 2, 3)));
    }

    @Test
    public void testSum() {
        assertEquals(10, NumberAnalyzer._sum(Arrays.asList(1, 4, 2, 3)));
    }

    @Test
    public void testMult() {
        assertEquals(24, NumberAnalyzer._mult(Arrays.asList(1, 4, 2, 3)));
    }
    
    @Test
    public void testEmptyList() {
        assertThrows(NoSuchElementException.class, () -> {
            NumberAnalyzer._min(Collections.emptyList());
        });
    }
}
