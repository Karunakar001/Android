package com.example.trail

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        class Dice(val numSides: Int) {
            fun roll(): Int {
                return (1..numSides).random()
            }
        }


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()

        }
    }

    private fun rollDice() {
        val diceObj = Dice(6)
        val randomNumber = diceObj.roll()
        val image: ImageView = findViewById(R.id.imageView)
//        when(randomNumber)
//        {
//            1->image.setImageResource(R.drawable.dice_1)
//            2->image.setImageResource(R.drawable.dice_2)
//            3->image.setImageResource(R.drawable.dice_3)
//            4->image.setImageResource(R.drawable.dice_4)
//            5->image.setImageResource(R.drawable.dice_5)
//            6->image.setImageResource(R.drawable.dice_6)
//        }
        val resultImage= when(randomNumber)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }

        image.setImageResource(resultImage)
        image.contentDescription=randomNumber.toString()

    }
}