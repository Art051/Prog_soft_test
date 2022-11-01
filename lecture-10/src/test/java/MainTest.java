import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{

    @Test
    public void ifCharacterTest() {
        Assertions.assertEquals(true, Main.checkIfCharacterNumber('1'));
        Assertions.assertEquals(true, Main.checkIfCharacterNumber('6'));
        Assertions.assertEquals(true, Main.checkIfCharacterNumber('8'));
        Assertions.assertEquals(false, Main.checkIfCharacterNumber('?'));
        Assertions.assertEquals(false, Main.checkIfCharacterNumber(':'));
        Assertions.assertEquals(false, Main.checkIfCharacterNumber('s'));
        Assertions.assertEquals(false, Main.checkIfCharacterNumber('e'));
        Assertions.assertEquals(false, Main.checkIfCharacterNumber('b'));

    }
    @Test
    public void ifStringIsNumberTest() {
        Assertions.assertEquals(true, Main.checkIfStringIsNumber("5"));
        Assertions.assertEquals(true, Main.checkIfStringIsNumber("234765"));
        Assertions.assertEquals(false, Main.checkIfStringIsNumber("1dfg"));
        Assertions.assertEquals(false, Main.checkIfStringIsNumber("gfdcgf"));
        Assertions.assertEquals(false, Main.checkIfStringIsNumber("f"));
        Assertions.assertEquals(false, Main.checkIfStringIsNumber("fgf[;'["));
        Assertions.assertEquals(false, Main.checkIfStringIsNumber("[][.'"));

    }
}
