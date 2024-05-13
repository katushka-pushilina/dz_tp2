
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

public class NumberAnalyzerTest {
    @Test
    public void testMin() {
        assertEquals(1, NumberAnalyzer.min(Arrays.asList(1, 4, 2, 3)));
    }

    @Test
    public void testMax() {
        assertEquals(4, NumberAnalyzer.max(Arrays.asList(1, 4, 2, 3)));
    }

    @Test
    public void testSum() {
        assertEquals(10, NumberAnalyzer.sum(Arrays.asList(1, 4, 2, 3)));
    }

    @Test
    public void testMult() {
        assertEquals(24, NumberAnalyzer.mult(Arrays.asList(1, 4, 2, 3)));
    }

    @Test
    public void testEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> NumberAnalyzer.min(Collections.emptyList()));
    }
}
