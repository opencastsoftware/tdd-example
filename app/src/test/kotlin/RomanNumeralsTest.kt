import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RomanNumeralsTest {
    @Test
    internal fun `should return I for 1`() {
        assertEquals("I", RomanNumerals.fromDecimal(1))
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
    internal fun `should return IX for 9`() {
        assertEquals("IX", RomanNumerals.fromDecimal(9))
    }
}