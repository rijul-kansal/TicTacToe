package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SingleMode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_mode)
        var ed1: EditText?=null
        ed1=findViewById(R.id.edittext3)
        var btn=findViewById<Button>(R.id.btn2)
        btn.setOnClickListener {
            if(ed1?.text!!.isNotEmpty())
            {
                var intent= Intent(this,Game::class.java)
                intent.putExtra("PlayerName1",ed1?.text.toString())
                intent.putExtra("Mode",1)
                startActivity(intent)
            }
            if(ed1?.text!!.isEmpty())
            {
                Toast.makeText(this,"Please enter Name", Toast.LENGTH_SHORT).show()
            }
        }


        }
}