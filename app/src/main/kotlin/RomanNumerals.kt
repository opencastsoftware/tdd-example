class RomanNumerals {
    companion object {
        fun fromDecimal(decimal: Int): String {
            var remaining = decimal
            val sb = StringBuilder()

            val numerals = listOf(
                Pair("M", 1000),
                Pair("CM", 900),
                Pair("D", 500),
                Pair("CD", 400),
                Pair("C", 100),
                Pair("XC", 90),
                Pair("L", 50),
                Pair("XL", 40),
                Pair("X", 10),
                Pair("IX", 9),
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