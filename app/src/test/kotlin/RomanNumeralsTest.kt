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
}