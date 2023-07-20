package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    var cd1:CardView?=null
    var cd2:CardView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cd1=findViewById(R.id.cardview1)
        cd2=findViewById(R.id.cardview2)

        cd1?.setOnClickListener {
            var intent = Intent(this,SingleMode::class.java)
            startActivity(intent)
        }
        cd2?.setOnClickListener {
            var intent = Intent(this,multiMode::class.java)
            startActivity(intent)
        }

    }
}