package lbauer

fun main(args: Array<String>){
    var a = 0
    var b = 1
    var max: Int
    if (a < b){
         max = b
    } else {
        max = a
    }

    println("a: $a")
    println("b: $b")
    println("max: $max")

    a = 3
    println("a: $a")

    // if as an expression
    max = if (a > b) a else b
    println("max: $max")

}