/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertOneReturnsI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertTenReturnsX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertFiftyReturnsL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvertNinetyReturnsXC() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void testConvertOneHundredReturnsC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertOneHundredAndOneThrowsException() {
        // L'unico errore accettato ora è da 101 in su!
        IntegerToRoman.convert(101);
    }
}