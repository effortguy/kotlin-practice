package practice

operator fun Char.times(count: Int): String {
    return toString().repeat(count);
}
