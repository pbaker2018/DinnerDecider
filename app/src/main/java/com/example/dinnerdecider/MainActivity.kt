package com.example.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.boss.dinnerdecider.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Pasta Remoli", "Wagamama", "Zizzi", "Pizza Express", "Nandos", "GBK", "Calabash", "Hemalaya")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            Log.d("TAG", "This is a test log")
        }
    }
}
