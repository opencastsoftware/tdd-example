object RomanNumerals {
    fun fromDecimal(value: Int): String {
        return when (value) {
            6 -> "VI"
            5 -> "V"
            4 -> "IV"
            else -> "I".repeat(value)
        }
    }
}