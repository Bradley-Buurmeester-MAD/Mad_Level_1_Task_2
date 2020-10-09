package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.btnSubmit.setOnClickListener{
            onSubmit()
        }
    }

    /**
     * checks form when submit is pressed
     */
    private fun onSubmit(){
        var firstAnswer = binding.txtFirst.text.toString()
        var secondAnswer = binding.txtSecond.text.toString()
        var thirdAnswer = binding.txtThird.text.toString()
        var fourthAnswer = binding.txtFourth.text.toString()

        var answer = firstAnswer + secondAnswer + thirdAnswer + fourthAnswer

        if (answer == getString(R.string.CorrectAnswer)) {
            Toast.makeText(this, getText(R.string.ToastMessageCorrect), Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(this, getText(R.string.ToastMessageIncorrect), Toast.LENGTH_LONG).show()
        }
    }
}