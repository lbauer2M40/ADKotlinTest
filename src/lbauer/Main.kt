package lbauer

import java.awt.Color
import kotlin.collections.ArrayList

fun main(args: Array<String>){

    var wheels:ArrayList<Wheel> = arrayListOf<Wheel>()
    for(i in 0..3){
        wheels.add(Wheel(100))
    }

    var key = Key(10)
    var car = Car(Color.RED,wheels, DoorLock(key))

    car.unlockDoor(key)
    println("locked: " + car.isLocked())

    car.lockDoor(Key(2))
    println("locked: " + car.isLocked())

    car.drive()
    println("driving: " + car.isDriving())

    car.stop()
    println("driving: " + car.isDriving())

}