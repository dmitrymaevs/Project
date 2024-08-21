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
}