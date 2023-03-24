import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RomanNumeralsTest {
    @Test
    internal fun `should return I for 1`() {
        assertEquals("I", RomanNumerals.fromDecimal(1))
    }

    @Test
    internal fun `should return II for 2`() {
        assertEquals("II", RomanNumerals.fromDecimal(2))
    }

    @Test
    internal fun `should return III for 3`() {
        assertEquals("III", RomanNumerals.fromDecimal(3))
    }

    @Test
    internal fun `should return IV for 4`() {
        assertEquals("IV", RomanNumerals.fromDecimal(4))
    }

    @Test
    internal fun `should return V for 5`() {
        assertEquals("V", RomanNumerals.fromDecimal(5))
    }

    @Test
    internal fun `should return VI for 6`() {
        assertEquals("VI", RomanNumerals.fromDecimal(6))
    }

    @Test
    internal fun `should return VII for 7`() {
        assertEquals("VII", RomanNumerals.fromDecimal(7))
    }

    @Test
    internal fun `should return VIII for 8`() {
        assertEquals("VIII", RomanNumerals.fromDecimal(8))
    }
}