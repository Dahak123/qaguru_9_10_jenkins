import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class SkippedTests {
    @Test
    @Disabled
    void Test0() {
        assertFalse(true);
    }

    @Test
    @Disabled
    void Test1() {
        assertFalse(true);
    }

    @Test
    @Disabled
    void Test2() {
        assertFalse(true);
    }

    @Test
    @Disabled
    void Test3() {
        assertFalse(true);
    }

    @Test
    @Disabled
    void Test4() {
        assertFalse(true);
    }

    @Test
    @Disabled("Some reason")
    void Test5() {
        assertFalse(true);
    }
}
