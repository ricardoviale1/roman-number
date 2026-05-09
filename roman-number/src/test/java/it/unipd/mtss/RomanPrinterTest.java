package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        // Arrange
        int number = 1;
        
        // Il disegno che ci aspettiamo per la singola "I" (con lo spazio finale)
        String expected = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintFive() { //
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
        // Arrange
        int number = 10; // Corrisponde a "X"
        
        String expected = 
            "\\   /  \n" +
            " \\ /   \n" +
            "  X    \n" +
            " / \\   \n" +
            "/   \\  \n" +
            "       \n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintFifteen() {
        int number = 15; // Corrisponde a "XV"
        
        // Unione del disegno di X e V con uno spazio in mezzo e l'andata a capo
        String expected = 
            "\\   /  \\      / \n" +
            " \\ /    \\    /  \n" +
            "  X      \\  /   \n" +
            " / \\      \\/    \n" +
            "/   \\     ||    \n" +
            "          ||    \n";

        assertEquals(expected, RomanPrinter.print(number));
    }
    @Test
    public void testPrintFifty() {
        int number = 50; // Corrisponde a "L"
        
        String expected = 
            " _       \n" +
            "| |      \n" +
            "| |      \n" +
            "| |      \n" +
            "| |___   \n" +
            "|_____|  \n";

        assertEquals(expected, RomanPrinter.print(number));
    }
}