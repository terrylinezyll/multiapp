package com.example.midcallclniteweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalcActivity : AppCompatActivity() {
    lateinit var Tv_answer:TextView
    lateinit var first_no:EditText
    lateinit var second_no:EditText
    lateinit var add:Button
    lateinit var subtract:Button
    lateinit var divide:Button
    lateinit var multiply:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        Tv_answer=findViewById(R.id.textView)
        first_no=findViewById(R.id.editTextNumber3)
        second_no=findViewById(R.id.editTextNumber4)
        add=findViewById(R.id.button)
        subtract=findViewById(R.id.button4)
        divide=findViewById(R.id.button6)
        multiply=findViewById(R.id.button5)
        add.setOnClickListener {
            var myfirstno=first_no.text.toString()
            var mysecondno=second_no.text.toString()
            if (myfirstno.isEmpty()&&mysecondno.isEmpty()){
                Tv_answer.text="Please input all the input"
            }
            else{
                var answer=myfirstno.toDouble() + mysecondno.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        subtract.setOnClickListener {
            var myfirstno=first_no.text.toString()
            var mysecondno=second_no.text.toString()
            if (myfirstno.isEmpty()&&mysecondno.isEmpty()){
                Tv_answer.text="Please input all the input"
            }
            else{
                var answer=myfirstno.toDouble() - mysecondno.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        multiply.setOnClickListener {
            var myfirstno=first_no.text.toString()
            var mysecondno=second_no.text.toString()
            if (myfirstno.isEmpty()&&mysecondno.isEmpty()){
                Tv_answer.text="Please input everything"
            }
            else{
                var answer=myfirstno.toDouble() * mysecondno.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        divide.setOnClickListener {
            var myfirstno=first_no.text.toString()
            var mysecondno=second_no.text.toString()
            if (myfirstno.isEmpty()&&mysecondno.isEmpty()){
                Tv_answer.text="Please input all the input"
            }
            else{
                var answer=myfirstno.toDouble() / mysecondno.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
    }
}