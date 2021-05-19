package lbauer

import java.util.*

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)

    when (scan.nextLine().toInt()) {
        1 ->
            println("x = 1")
        2 ->
            println("x = 2")
        3,4 ->
            println("x is either 3 or 4")
        5 -> {
            print("x = ")
            println(5)
        }
        else ->
            println("Hello!")

    }
}