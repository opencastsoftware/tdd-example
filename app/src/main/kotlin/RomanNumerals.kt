object RomanNumerals {
    private val numeralValues = listOf(
        "M" to 1000, "CM" to 900, "D" to 500, "CD" to 400,
        "C" to 100, "XC" to 90, "L" to 50, "XL" to 40,
        "X" to 10, "IX" to 9, "V" to 5, "IV" to 4, "I" to 1
    )

    fun fromDecimal(decimal: Int): String =
        numeralValues.fold(decimal to "") { (remaining, result), (numeral, value) ->
            val count = remaining / value
            val remainder = remaining % value
            remainder to result + numeral.repeat(count)
        }.second
}
