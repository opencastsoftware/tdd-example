import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RomanNumeralsTest {
    @Test
    internal fun `should return I for 1`() {
        assertEquals("I", RomanNumerals.fromDecimal(1))
    }
}