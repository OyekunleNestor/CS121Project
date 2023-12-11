// StaticActivityTest.java
package staticActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticActivityTest {
    private StaticActivity obj1;
    private StaticActivity obj2;

    @BeforeEach
    public void setUp() {
        obj1 = new StaticActivity(1, 2.5, "Hello");
        obj2 = new StaticActivity(3, 4.7, "World");
    }

    @Test
    public void testInstanceCount() {
        int expectedInstanceCount = 2;
        int actualInstanceCount = StaticActivity.getInstanceCount();
        assertEquals(expectedInstanceCount, actualInstanceCount, "Instance count should be 2");
    }
}
