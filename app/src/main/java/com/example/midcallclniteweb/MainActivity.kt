package com.example.midcallclniteweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class       MainActivity : AppCompatActivity() {
    lateinit var buttoncal:Button
    lateinit var buttonint:Button
    lateinit var buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncal=findViewById(R.id.Btncall)
        buttonint=findViewById(R.id.button2)
        buttonweb=findViewById(R.id.button3)

        buttoncal.setOnClickListener {
            val calc = Intent(this, CalcActivity::class.java)
            startActivity(calc)
        }
            buttonint.setOnClickListener {
                var int = Intent(
                    this, IntentActivity::class.java
                )
                startActivity(int)
            }
                buttonweb.setOnClickListener {
                    var web=Intent(this,WebActivity::class.java)
                    startActivity(web)
                }

            }
        }
