class RomanNumerals {
    companion object {
        private val numerals = listOf(
            "M" to 1000, "CM" to 900, "D" to 500, "CD" to 400,
            "C" to 100, "XC" to 90, "L" to 50, "XL" to 40,
            "X" to 10, "IX" to 9, "V" to 5, "IV" to 4, "I" to 1
        )

        fun fromDecimal(decimal: Int): String {
            var remaining = decimal
            val sb = StringBuilder()

            numerals.forEach { (numeral, value) ->
                while (remaining >= value) {
                    sb.append(numeral)
                    remaining -= value
                }
            }

            return sb.toString()
        }
    }
}