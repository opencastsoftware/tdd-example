class RomanNumerals {
    companion object {
        fun fromDecimal(decimal: Int): String {
            var remaining = decimal
            val sb = StringBuilder()

            while (remaining > 0) {
                when {
                    remaining >= 4 -> {
                        sb.append("IV")
                        remaining -= 4
                    }
                    remaining >= 1 -> {
                        sb.append("I")
                        remaining -= 1
                    }
                }
            }

            return sb.toString()
        }
    }
}