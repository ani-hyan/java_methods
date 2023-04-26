import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    String string1;
    String string2;
    String string3;
    String string4;

    @BeforeEach
    public void setUp() {
        string1 = new String("Hello");
        string2 = new String();
        string3 = "hello";
        string4 = "hi";
    }

    @Test
    @DisplayName("Normal case")
    public void testCharAt1() {
        assertEquals('e', string1.charAt(1));
    }

    @Test
    @DisplayName("Out of bound index")
    public void testCharAt2() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    string1.charAt(5);
                });
    }

    @Test
    @DisplayName("Empty string")
    public void testCharAt3() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    string2.charAt(0);
                });
    }

    @Test
    @DisplayName("Negative index")
    public void testCharAt4() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    string1.charAt(-3);
                });
    }

    @Test
    @DisplayName("Comparing two strings with the same values")
    public void testCompareTo1() {
        assertTrue(0 == string3.compareTo(string3));
    }

    @Test
    @DisplayName("Comparing two strings with the same names but different Cases")
    public void testCompareTo2() {
        assertTrue(0 > string1.compareTo(string3));
    }

    @Test
    @DisplayName("Comparing two strings with the same names but different Cases")
    public void testCompareTo3() {
        assertTrue(0 < string3.compareTo(string1));
    }

    @Test
    @DisplayName("Comparing with an empty string")
    public void testCompareTo4() {
        assertTrue(0 < string2.compareTo(string1));
    }

    @Test
    @DisplayName("Comparing two strings with different lengths")
    public void testCompareTo5() {
        assertTrue(0 > string3.compareTo(string4));
    }

    @Test
    @DisplayName("Concatenating two Strings")
    public void testConcat1() {
        assertTrue("hellohi".equals(string3.concat(string4)));
    }

    @Test
    @DisplayName("Concatenating with an empty string")
    public void testConcat2() {
        assertTrue(string3 == string3.concat(string2));
    }

    @Test
    @DisplayName("Tests equals strings")
    public void testEquals1() {
        assertTrue("hello".equals(string3));
    }

    @Test
    @DisplayName("Equals with null and empty")
    public void testEquals2() {
        String str2 = null;
        assertFalse(string2.equals(str2));
    }

    @Test
    @DisplayName("Index of an existing substring")
    public void testIndexOf1() {
        assertEquals(3, string1.indexOf("lo"));
    }

    @Test
    @DisplayName("Index of non-existing substring")
    public void testIndexOf2() {
        assertEquals(-1, string1.indexOf("ye"));
    }

}
