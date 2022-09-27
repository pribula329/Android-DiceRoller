package luky.onlinekurz.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // find button
        val rollButton: Button = findViewById(R.id.button)
        // what program must do after click on button
        rollButton.setOnClickListener {
            // message on screen
            val toast = Toast.makeText(this, "Kocka sa toci!!!!", Toast.LENGTH_SHORT)
            toast.show()
            // change TextView
            val resultImageView: ImageView = findViewById(R.id.actualNumber)
            displayDice(resultImageView,rollDice())
        }

    }

    // function for generate number
    private fun rollDice(): Int {
        val myFirstDice = Dice(6)
        println("Pocet stran kocky: ${myFirstDice.numSides}")
        val num = myFirstDice.roll()
        println("Hodil si cislo ${num}")
        if (num == 4){
            println("Super stastne cislo")
        }
        return num
    }

    private fun displayDice(image: ImageView, numberOfView: Int){
        when(numberOfView){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)
        }
    }

}