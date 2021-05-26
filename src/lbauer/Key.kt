package lbauer

class Key (val keyid: Int) {

    fun equals (other: Key): Boolean {
        return keyid == other.keyid
    }

}