package lbauer

import java.util.*

fun main(args: Array<String>){
    val generateNumber: (Random) -> Int = { random ->
        random.nextInt(10)+1
    }
    val random = Random()
    val rand = generateNumber(random)
    var bool = true;
    var scan = Scanner(System.`in`)

    do {
        if(!bool)
            println(answerString(0))
        var inp = Integer.parseInt(scan.nextLine())
        bool = inp == rand
    }while(!bool)

    scan.close()
    println(answerString(1) + rand)
}

fun answerString(b: Int): String = if(b == 0){
        "Again"
    }else {
        "Congrats, you found the random number: "
    }