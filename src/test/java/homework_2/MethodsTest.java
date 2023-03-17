package homework_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    Methods m;

    @BeforeEach
    void setUp(){
        m = new Methods();
    }

    @Test
    void testFirst(){
        assertTrue(0 == m.first(3,2));
    }

    @Test
    void testFourth(){
        assertEquals('a', m.fourth('a'));
    }

    @Test
    void testFifth(){
        assertTrue(-2 == m.fifth(2,-2));
    }

    @Test
    @DisplayName("With a number <= 10")
    void testSixth1(){
        assertEquals(10, m.sixth(5));
    }

    @Test
    @DisplayName("With a number > 10")
    void testSixth2(){
        assertFalse(10 == m.sixth(14));
    }
}