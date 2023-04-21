import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ClassWithBugsTest {
    @Test
    internal fun shouldIncrementValueByOne() {
        val classWithBugs = ClassWithBugs()
        assertEquals(2, classWithBugs.increment(1))
    }
}