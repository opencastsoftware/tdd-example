object RomanNumerals {
    fun fromDecimal(value: Int): String {
        if (value > 5) {
            return "V" + fromDecimal(value % 5)
        }

        return when (value) {
            5 -> "V"
            4 -> "IV"
            else -> "I".repeat(value)
        }
    }
}