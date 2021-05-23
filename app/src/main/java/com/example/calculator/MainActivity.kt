package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity  : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editNum1: EditText = findViewById(R.id.editNum1)
        var editNum2: EditText = findViewById(R.id.editNum2)
        var tvOutput: TextView = findViewById(R.id.tvOutput)
        var btnSum:Button = findViewById(R.id.btnSum)
        var btnSubtract:Button = findViewById(R.id.btnSubtract)



        btnSum.setOnClickListener {
            if (editNum1.text.toString() == "" || editNum2.text.toString() == ""){
                var error = "Please enter a number"
                Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
            }else {
                val num1 = editNum1.text.toString().toInt()
                val num2 = editNum2.text.toString().toInt()
                val sum = num1 + num2
                tvOutput.text = "Answer:$sum"
            }
        }
        btnSubtract.setOnClickListener {
            if (editNum1.text.toString() == "" || editNum2.text.toString() == ""){
                var error = "Please enter a number"
                Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
            }else {
                val num1 = editNum1.text.toString().toInt()
                val num2 = editNum2.text.toString().toInt()
                val sum = num1 - num2
                tvOutput.text = "Answer:$sum"
            }
        }
     }

//    Using function of the onclick button attribute in the xml file
    fun onModulus(view: View) {
        var editNum1: EditText = findViewById(R.id.editNum1)
        var editNum2: EditText = findViewById(R.id.editNum2)
        var tvOutput: TextView = findViewById(R.id.tvOutput)

        if (editNum1.text.toString() == "" || editNum2.text.toString() == ""){
            var error = "Please enter a number"
            Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
        }else {
            val num1 = editNum1.text.toString().toInt()
            val num2 = editNum2.text.toString().toInt()
            val sum = num1 % num2
            tvOutput.text = "Answer:$sum"
        }
    }

    fun onMultiplication(view: View) {
        var editNum1: EditText = findViewById(R.id.editNum1)
        var editNum2: EditText = findViewById(R.id.editNum2)
        var tvOutput: TextView = findViewById(R.id.tvOutput)

        if (editNum1.text.toString() == "" || editNum2.text.toString() == ""){
            var error = "Please enter a number"
            Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
        }else {
            val num1 = editNum1.text.toString().toInt()
            val num2 = editNum2.text.toString().toInt()
            val sum = num1 * num2
            tvOutput.text = "Answer:$sum"
        }
    }

}

