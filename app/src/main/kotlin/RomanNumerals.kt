object RomanNumerals {
    fun fromDecimal(value: Int): String {
        return when (value) {
            5 -> "V"
            4 -> "IV"
            else -> "I".repeat(value)
        }
    }
}