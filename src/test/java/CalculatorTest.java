import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add() {
        assertEquals(13, calculator.add(7, 6));
        assertEquals(-9, calculator.add(5, -14));
    }

    @Test
    void div() {
        assertEquals(11, calculator.div(15, 4));
        assertEquals(-5, calculator.div(0, 5));
    }

    @Test
    void dif() {
        assertEquals(13, calculator.div(143, 11));
        assertEquals(0, calculator.div(7, 0));
    }

    @Test
    void times() {
        assertEquals(143, calculator.times(13, 11));
        assertEquals(0, calculator.times(3, 0));
    }

    @Test
    void solver() {
        // x² - 5x + 6 = 0 => корни: 2 и 3
        double[] roots1 = calculator.solveQuadratic(1, -5, 6);
        assertArrayEquals(new double[]{2.0, 3.0}, roots1, 0.0001);

        // x² - 4x + 4 = 0 => корень: 2 (два одинаковых корня)
        double[] roots2 = calculator.solveQuadratic(1, -4, 4);
        assertArrayEquals(new double[]{2.0}, roots2, 0.0001);

        // x² + 1 = 0 => нет действительных корней
        double[] roots3 = calculator.solveQuadratic(1, 0, 1);
        assertEquals(0, roots3.length);

        // 2x + 4 = 0 (линейное) => корень: -2
        double[] roots4 = calculator.solveQuadratic(0, 2, 4);
        assertArrayEquals(new double[]{-2.0}, roots4, 0.0001);

        // x² - 4 = 0 => корни: -2 и 2
        double[] roots5 = calculator.solveQuadratic(1, 0, -4);
        assertArrayEquals(new double[]{-2.0, 2.0}, roots5, 0.0001);
    }
}