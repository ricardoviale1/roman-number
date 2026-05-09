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
    public void testConvertThreeReturnsIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvertFourReturnsIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvertFiveReturnsV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvertSixReturnsVI() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvertNineReturnsIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvertTenReturnsX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertFourteenReturnsXIV() {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvertNineteenReturnsXIX() {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void testConvertTwentyReturnsXX() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertTwentyOneThrowsException() {
        // L'unico errore che ci aspettiamo ora è per i numeri superiori a 20!
        IntegerToRoman.convert(21);
    }
}