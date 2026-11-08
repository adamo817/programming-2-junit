package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

    @Test
    void testThousandsSeperator() {
        PriceFormatter formatter = new PriceFormatter();

        String result = formatter.formatPrice(1234);

        assertEquals("1 234 €", result);

    }

    @Test
    void testDecimalsSeperator() {
        PriceFormatter formatter = new PriceFormatter();

        String result = formatter.formatPrice(3.14);

        assertEquals("3,14 €", result);

    }

    @Test
    void testRounding() {
        PriceFormatter formatter = new PriceFormatter();

        String result = formatter.formatPrice(3.1456);

        assertEquals("3,15 €", result);

    }

    @Test
    void testRoundingDown() {
        PriceFormatter formatter = new PriceFormatter();

        String result = formatter.formatPrice(3.14159);

        assertEquals("3,14 €", result);
    }

    @Test
    void testSingleDecimalDigit() {
        PriceFormatter formatter = new PriceFormatter();

        String result = formatter.formatPrice(3.5);

        assertEquals("3,50 €", result);
    }

    @Test
    void testZeroDecimals() {
        PriceFormatter formatter = new PriceFormatter();

        String result = formatter.formatPrice(3.00);

        assertEquals("3 €", result);
    }

    @Test
    void testEuroEnd() {
        PriceFormatter formatter = new PriceFormatter();

        String result = formatter.formatPrice(3.14);

        assertEquals("3,14 €", result);
    }
}
