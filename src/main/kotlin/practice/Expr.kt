package practice

interface Expr {
}

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

//fun eval (e: Expr): Int {
//    if (e is Num) {
//        return e.value
//    }
//
//    if (e is Sum) {
//        return eval(e.left) + eval(e.right)
//    }
//
//    throw IllegalArgumentException("Unknown expression")
//}

fun eval (e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval(e.left) + eval(e.right)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }