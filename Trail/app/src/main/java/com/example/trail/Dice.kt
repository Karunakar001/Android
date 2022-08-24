package com.example.trail

class Dice(val numSides:Int)
{
    fun roll(): Int {
        return (1..numSides).random()
    }
}

fun main()
{
    val diceObj1=Dice(6)
    val diceObj2=Dice(20)
    println("sides = ${diceObj1.numSides} and random number of dice roll is ${diceObj1.roll()}")
    println("sides = ${diceObj2.numSides} and random number of dice roll is ${diceObj2.roll()}")
}