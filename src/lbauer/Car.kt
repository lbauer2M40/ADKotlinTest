package lbauer

import java.awt.Color

class Car (private val color: Color,
           private var wheels: List<Wheel>,
           private var doorLock: DoorLock)
{

    private var driving: Boolean = false

    fun isLocked(): Boolean = doorLock.isLocked()
    fun isDriving(): Boolean = driving

    fun unlockDoor(key: Key){
        doorLock.unlock(key)
    }

    fun lockDoor(key: Key){
        doorLock.lock(key)
    }

    fun drive(){
        if(wheels.size == 4){
            driving = true
        }
    }

    fun stop(){
        if(driving){
            driving = false
        }
    }
}