import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testTooShortName() {
        Account account = new Account("Тим");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testTooLongName() {
        Account account = new Account("Тимоти Шаламе Петрович");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithoutSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithLeadingSpace() {
        Account account = new Account(" Тимоти Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithTrailingSpace() {
        Account account = new Account("Тимоти Шаламе ");
        assertFalse(account.checkNameToEmboss());
    }
}