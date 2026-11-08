package refactoring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfYearTest {

    @Test
    void testFirstDayOfYear() {

        int result = DayOfYear.dayOfYear(1, 1, 2023);

        assertEquals(1, result);
    }

    @Test
    void testFirstDayOfFeb() {

        int result = DayOfYear.dayOfYear(2, 1, 2023);

        assertEquals(32, result);

    }

    @Test
    void testNonLeapYear() {

        int result = DayOfYear.dayOfYear(3, 1, 2023);

        assertEquals(60, result);
    }

    @Test
    void testLeapYear() {

        int result = DayOfYear.dayOfYear(3, 1, 2024);

        assertEquals(61, result);
    }

    @Test
    void testFirstDayOfJune() {

        int result = DayOfYear.dayOfYear(6, 1, 2023);

        assertEquals(152, result);

    }

    @Test
    void testFirstDayOfSept() {

        int result = DayOfYear.dayOfYear(9, 1, 2023);

        assertEquals(244, result);

    }

    @Test
    void testLastDayOfNormalYear() {

        int result = DayOfYear.dayOfYear(12, 31, 2023);

        assertEquals(365, result);
    }

    @Test
    void testLastDayOfLeapYear() {

        int result = DayOfYear.dayOfYear(12, 31, 2024);

        assertEquals(366, result);
    }

}
