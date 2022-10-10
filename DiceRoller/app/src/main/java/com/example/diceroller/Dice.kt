package com.example.diceroller

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice just rolled ${myFirstDice.roll()}!")
    val mySecondDice = Dice(20)
    print("Your ${mySecondDice.numSides} sided dice just rolled ${mySecondDice.roll()}!")


}