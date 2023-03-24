object RomanNumerals {
    fun fromDecimal(value: Int): String {
        return when {
            value == 10 -> "X"
            value == 9 -> "IX"
            value > 5 -> "V" + fromDecimal(value - 5)
            value == 5 -> "V"
            value == 4 -> "IV"
            else -> "I".repeat(value)
        }
    }
}