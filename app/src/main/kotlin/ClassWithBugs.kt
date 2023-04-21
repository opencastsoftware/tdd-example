class ClassWithBugs {
    fun increment(value: Int): Int {
        return value + 1
    }

    fun decrement(value: Int): Int {
        return value + 1
    }
}