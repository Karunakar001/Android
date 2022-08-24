package com.example.trail

class Coin {
    fun flip():String
    {
        val randomNumber=(1..2).random()
        return if(randomNumber==1)
            "heads"
        else
            "tails"
    }
}
fun main()
{
    val coin1=Coin()
    val coin2=Coin()
    println("Coin 1 : Its ${coin1.flip()}")
    println("Coin 2 : Its ${coin2.flip()}")
}