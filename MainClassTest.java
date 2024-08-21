import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int expected = 14;
        int actual = mainClass.getLocalNumber();
        assertEquals("Метод getLocalNumber должен возвращать 14", expected, actual);
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int actual = mainClass.getClassNumber();
        assertTrue("Метод getClassNumber должен возвращать число больше 45", actual > 45);
    }

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String actual = mainClass.getClassString();
        assertTrue("Метод getClassString должен возвращать строку, содержащую 'hello' или 'Hello'",
                actual.contains("hello") || actual.contains("Hello"));
    }
}