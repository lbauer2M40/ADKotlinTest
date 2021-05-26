package lbauer

class DoorLock (val key: Key) {

    var locked: Boolean = false

    fun isLocked() = locked

    fun lock(key: Key) {
        if(this.key.equals(key))
            locked = true
    }

    fun unlock(key: Key) {
        if(this.key.equals(key))
            locked = false
    }

}