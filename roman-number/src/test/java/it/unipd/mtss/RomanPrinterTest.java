/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        int number = 1;
        String expected = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n";

        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintFive() {
        int number = 5;
        String expected = 
            "\\      / \n" +
            " \\    /  \n" +
            "  \\  /   \n" +
            "   \\/    \n" +
            "   ||    \n" +
            "   ||    \n";

        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintTen() {
        int number = 10;
        String expected = 
            "\\   /  \n" +
            " \\ /   \n" +
            "  X    \n" +
            " / \\   \n" +
            "/   \\  \n" +
            "       \n";

        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintFifty() {
        int number = 50;
        String expected = 
            " _       \n" +
            "| |      \n" +
            "| |      \n" +
            "| |      \n" +
            "| |___   \n" +
            "|_____|  \n";

        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintOneHundred() {
        int number = 100;
        String expected = 
            " _____  \n" +
            "/  __ \\ \n" +
            "| /  \\/ \n" +
            "| |     \n" +
            "| \\__/\\ \n" +
            " \\____/ \n";

        assertEquals(expected, RomanPrinter.print(number));
    }
}