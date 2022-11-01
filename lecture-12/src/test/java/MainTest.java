import org.example.CharacterEncryptionException;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{

    @Test
    public void TestNoCharacterShift() throws Exception
    {
        Assertions.assertEquals('a', Main.encryptCharacter('a', 0));
        Assertions.assertEquals('z', Main.encryptCharacter('z', 0));
        Assertions.assertEquals('m', Main.encryptCharacter('m', 0));
        Assertions.assertEquals('A', Main.encryptCharacter('A', 0));
        Assertions.assertEquals('Z', Main.encryptCharacter('Z', 0));
        Assertions.assertEquals('M', Main.encryptCharacter('M', 0));
    }

    @Test
    public void TestOneCharacterShiftNoOverflow() throws Exception
    {
        Assertions.assertEquals('a', Main.encryptCharacter('b', 1));
        Assertions.assertEquals('y', Main.encryptCharacter('z', 1));
        Assertions.assertEquals('m', Main.encryptCharacter('n', 1));
        Assertions.assertEquals('A', Main.encryptCharacter('B', 1));
        Assertions.assertEquals('Y', Main.encryptCharacter('Z', 1));
        Assertions.assertEquals('M', Main.encryptCharacter('N', 1));
    }

    @Test
    public void TestTwoCharacterShiftNoOverflow() throws Exception
    {
        Assertions.assertEquals('a', Main.encryptCharacter('c', 2));
        Assertions.assertEquals('x', Main.encryptCharacter('z', 2));
        Assertions.assertEquals('l', Main.encryptCharacter('n', 2));
        Assertions.assertEquals('A', Main.encryptCharacter('C', 2));
        Assertions.assertEquals('X', Main.encryptCharacter('Z', 2));
        Assertions.assertEquals('L', Main.encryptCharacter('N', 2));
    }

    @Test
    public void TestLargerCharacterShiftNoOverflow() throws Exception
    {
        Assertions.assertEquals('p', Main.encryptCharacter('z', 10));
        Assertions.assertEquals('k', Main.encryptCharacter('w', 12));
        Assertions.assertEquals('a', Main.encryptCharacter('p', 15));
        Assertions.assertEquals('a', Main.encryptCharacter('z', 25));
        Assertions.assertEquals('P', Main.encryptCharacter('Z', 10));
        Assertions.assertEquals('K', Main.encryptCharacter('W', 12));
        Assertions.assertEquals('A', Main.encryptCharacter('Z', 25));
    }

    @Test
    public void TestOneCharacterShiftWithOverflow() throws Exception
    {
        Assertions.assertEquals('z', Main.encryptCharacter('a', 1));
        Assertions.assertEquals('Z', Main.encryptCharacter('A', 1));
    }

    @Test
    public void TestMultipleCharacterShiftWithOverflow() throws Exception
    {
        //abcdefghijklmnopqrstuvwxyz
        Assertions.assertEquals('y', Main.encryptCharacter('a', 2));
        Assertions.assertEquals('x', Main.encryptCharacter('c', 5));
        Assertions.assertEquals('s', Main.encryptCharacter('m', 20));
        Assertions.assertEquals('Y', Main.encryptCharacter('A', 2));
        Assertions.assertEquals('X', Main.encryptCharacter('C', 5));
        Assertions.assertEquals('S', Main.encryptCharacter('M', 20));
    }

    @Test
    public void TestSimpleMultipleOverflow() throws Exception
    {
        //abcdefghijklmnopqrstuvwxyz
        Assertions.assertEquals('z', Main.encryptCharacter('z', 26));
        Assertions.assertEquals('a', Main.encryptCharacter('a', 26));
        Assertions.assertEquals('m', Main.encryptCharacter('m', 26));
        Assertions.assertEquals('Z', Main.encryptCharacter('Z', 26));
        Assertions.assertEquals('A', Main.encryptCharacter('A', 26));
        Assertions.assertEquals('M', Main.encryptCharacter('M', 26));
        Assertions.assertEquals('y', Main.encryptCharacter('z', 27));
        Assertions.assertEquals('a', Main.encryptCharacter('b', 27));
        Assertions.assertEquals('m', Main.encryptCharacter('n', 27));
        Assertions.assertEquals('Y', Main.encryptCharacter('Z', 27));
        Assertions.assertEquals('A', Main.encryptCharacter('B', 27));
        Assertions.assertEquals('M', Main.encryptCharacter('N', 27));
    }

    @Test
    public void TestComplexMultipleOverflow() throws Exception
    {
        //abcdefghijklmnopqrstuvwxyz
        Assertions.assertEquals('z', Main.encryptCharacter('z', 52));
        Assertions.assertEquals('a', Main.encryptCharacter('a', 52));
        Assertions.assertEquals('m', Main.encryptCharacter('m', 52));
        Assertions.assertEquals('k', Main.encryptCharacter('m', 54));
        Assertions.assertEquals('o', Main.encryptCharacter('m', 50));
        Assertions.assertEquals('a', Main.encryptCharacter('a', 130));
        Assertions.assertEquals('Z', Main.encryptCharacter('Z', 52));
        Assertions.assertEquals('A', Main.encryptCharacter('A', 52));
        Assertions.assertEquals('M', Main.encryptCharacter('M', 52));
        Assertions.assertEquals('K', Main.encryptCharacter('M', 54));
        Assertions.assertEquals('O', Main.encryptCharacter('M', 50));
        Assertions.assertEquals('A', Main.encryptCharacter('A', 130));
    }

    @Test
    public void TestCharacterException() throws Exception
    {
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('!', 0);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('!', 10);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('!', 50);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('`', 1);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('0', 1);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('9', 5);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('5', 17);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('&', 4);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('^', 9);
        });
    }

    @Test
    public void TestNegativeShiftNumber() throws Exception
    {
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('a', -1);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('t', -10);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('T', -10);
        });
        Assertions.assertThrows(CharacterEncryptionException.class, () ->
        {
            Main.encryptCharacter('o', -500);
        });
    }

    @Test
    public void testNegativeShiftWithSpaces() throws Exception
    {
        Assertions.assertEquals("a a", Main.encryptWholeSentence("b b", 1));
        Assertions.assertEquals("a ", Main.encryptWholeSentence("b ", 1));
        Assertions.assertEquals("ff ff", Main.encryptWholeSentence("hh hh", 2));
        Assertions.assertEquals("m m m", Main.encryptWholeSentence("z z z", 13));
    }

    @Test
    public void testNegativeShiftWithSpacesOverflow() throws Exception
    {
        Assertions.assertEquals("z z", Main.encryptWholeSentence("a a", 1));
        Assertions.assertEquals("z ", Main.encryptWholeSentence("a ", 1));
        Assertions.assertEquals("zz zz", Main.encryptWholeSentence("bb bb", 2));
        Assertions.assertEquals("m m m", Main.encryptWholeSentence("z z z", 13));
    }
}
