package luky.onlinekurz.diceroller

class Dice(val numSides: Int) {


    fun roll(): Int {
        val rangeNumbers = 1..numSides
        val randomNumber = rangeNumbers.random()
        return randomNumber
    }
}