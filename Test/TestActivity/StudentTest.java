package TestActivity;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    public void testGetName() {
        Student student = new Student("John Doe", 12345);
        assertEquals("John Doe", student.getName(), "Incorrect name");
    }

    @Test
    public void testGetId() {
        Student student = new Student("Jane Smith", 67890);
        assertEquals(67890, student.getId(), "Incorrect ID");
    }
}
