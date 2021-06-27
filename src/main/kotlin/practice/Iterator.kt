package practice

import java.util.*

//    for (i in 1..100) {
//        println(fizzBuzz(i))
//    }

//    for (i in 100 downTo 1 step 2) {
//        println(fizzBuzz(i))
//    }

//    for (i in 0 until 100) {
//        println(fizzBuzz(i))
//    }

fun printMap() {

    val binaryRepos = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepos[c] = binary
    }

    for ((letter, binary) in binaryRepos) {
        println("$letter = $binary")
    }
}

fun printList() {

    val list = arrayListOf("10", "11", "1001")
    for ((i, e) in list.withIndex()) {
        println("$i: $e");
    }
}