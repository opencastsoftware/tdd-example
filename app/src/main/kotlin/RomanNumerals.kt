class RomanNumerals {
    companion object {
        fun fromDecimal(decimal: Int): String {
            var remaining = decimal
            val sb = StringBuilder()

            val numerals = listOf(
                Pair("V", 5),
                Pair("IV", 4),
                Pair("I", 1)
            )

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