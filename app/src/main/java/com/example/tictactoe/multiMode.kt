package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class multiMode : AppCompatActivity() {

    var ed1:EditText?=null
    var ed2:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_mode)

        ed1=findViewById(R.id.edittext1)
        ed2=findViewById(R.id.edittext2)
        var btn=findViewById<Button>(R.id.btn1)
        btn.setOnClickListener {
            if(ed1?.text!!.isNotEmpty()  && ed2?.text!!.isNotEmpty())
            {
               var intent=Intent(this,Game::class.java)
               intent.putExtra("PlayerName1",ed1?.text.toString())
               intent.putExtra("PlayerName2",ed2?.text.toString())
               intent.putExtra("Mode",2)
                startActivity(intent)
            }
            if(ed1?.text!!.isEmpty() || ed2?.text!!.isEmpty())
            {
                Toast.makeText(this,"Please enter Name",Toast.LENGTH_SHORT).show()
            }
        }



    }
}