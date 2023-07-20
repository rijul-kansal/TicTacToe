package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Game : AppCompatActivity(), View.OnClickListener {
    var flag=0
    private var tv1:TextView?=null
    private var tv2:TextView?=null
    private var tv3:TextView?=null
    private var tv4:TextView?=null
    private var tv5:TextView?=null
    private var tv6:TextView?=null
    private var tv7:TextView?=null
    private var tv8:TextView?=null
    private var tv9:TextView?=null
    private var player1name:TextView?=null
    private var player2name:TextView?=null
    private var player1score:TextView?=null
    private var player2score:TextView?=null
    private var WinnerName:TextView?=null
    private var restart:Button?=null

    var count1=0
    var count2=0
    var total=0
    val arr = Array(3) { IntArray(3) {-1} }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        tv1=findViewById(R.id.tv1)
        tv2=findViewById(R.id.tv2)
        tv3=findViewById(R.id.tv3)
        tv4=findViewById(R.id.tv4)
        tv5=findViewById(R.id.tv5)
        tv6=findViewById(R.id.tv6)
        tv7=findViewById(R.id.tv7)
        tv8=findViewById(R.id.tv8)
        tv9=findViewById(R.id.tv9)
        restart=findViewById(R.id.restart)
        player1name=findViewById(R.id.player1)
        player2name=findViewById(R.id.player2)
        player1score=findViewById(R.id.player1score)
        player2score=findViewById(R.id.player2score)
        WinnerName=findViewById(R.id.WinnerName)
        tv1?.setOnClickListener(this)
        tv2?.setOnClickListener(this)
        tv3?.setOnClickListener(this)
        tv4?.setOnClickListener(this)
        tv5?.setOnClickListener(this)
        tv6?.setOnClickListener(this)
        tv7?.setOnClickListener(this)
        tv8?.setOnClickListener(this)
        tv9?.setOnClickListener(this)
        restart?.setOnClickListener(this)
        var mode=intent.getIntExtra("Mode",0)
        player1name?.text=intent.getStringExtra("PlayerName1")+"(O)"
        if(mode==1)
        player2name?.text="Computer(X)".toString()
        else
        player2name?.text=intent.getStringExtra("PlayerName2")+"(X)"
    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.tv1->
            {
                count()
               tv1.let {
                    if(flag==0)
                    {
                        tv1?.text="O"
                        arr[0][0]=0
                        flag=1
                    }
                    else
                    {
                        tv1?.text="X"
                        arr[0][0]=1
                        flag=0
                    }
               }
               fn()
            }
            R.id.tv2->
            {
                count()
               tv2.let {
                    if(flag==0)
                    {
                        tv2?.text="O"
                        arr[0][1]=0
                        flag=1
                    }
                    else
                    {
                        tv2?.text="X"
                        arr[0][1]=1
                        flag=0
                    }
               }
                fn()
            }
            R.id.tv3->
            {
                count()
                tv3.let {
                    if(flag==0)
                    {
                        tv3?.text="O"
                        arr[0][2]=0
                        flag=1
                    }
                    else
                    {
                        tv3?.text="X"
                        arr[0][2]=1
                        flag=0
                    }
                }
                fn()
            }
            R.id.tv4->
            {
                count()
                tv4.let {
                    if(flag==0)
                    {
                        tv4?.text="O"
                        arr[1][0]=0
                        flag=1
                    }
                    else
                    {
                        tv4?.text="X"
                        arr[1][0]=1
                        flag=0
                    }
                }
                fn()
            }
            R.id.tv5->
            {
                count()
                tv5.let {
                    if(flag==0)
                    {
                        tv5?.text="O"
                        arr[1][1]=0
                        flag=1
                    }
                    else
                    {
                        tv5?.text="X"
                        arr[1][1]=1
                        flag=0
                    }

                }
                fn()
            }
            R.id.tv6->
            {
                count()
                tv6.let {
                    if(flag==0)
                    {
                        tv6?.text="O"
                        arr[1][2]=0
                        flag=1
                    }
                    else
                    {
                        tv6?.text="X"
                        arr[1][2]=1
                        flag=0
                    }
                }
                fn()
            }
            R.id.tv7->
            {
                count()
                tv7.let {
                    if(flag==0)
                    {
                        tv7?.text="O"
                        arr[2][0]=0
                        flag=1
                    }
                    else
                    {
                        tv7?.text="X"
                        arr[2][0]=1
                        flag=0
                    }
                }
                fn()
            }
            R.id.tv8->
            {
                count()
                tv8.let {
                    if(flag==0)
                    {
                        tv8?.text="O"
                        arr[2][1]=0
                        flag=1
                    }
                    else
                    {
                        tv8?.text="X"
                        arr[2][1]=1
                        flag=0
                    }
                }
                fn()
            }
            R.id.tv9->
            {
                count()
                tv9.let {
                    if(flag==0)
                    {
                        tv9?.text="O"
                        arr[2][2]=0
                        flag=1
                    }
                    else
                    {
                        tv9?.text="X"
                        arr[2][2]=1
                        flag=0
                    }
                }
                fn()
            }
            R.id.restart->
            {
                default()
                flag=0
                WinnerName?.text=""
                total=0
            }
        }
    }
    private fun fn()
    {
        if(arr[0][0]==arr[0][1] && arr[0][0]==arr[0][2] && arr[0][0]!=-1)
        {
            if(arr[0][0]==0) {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[0][0]==1) {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
        if(arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0] && arr[0][0]!=-1)
        {
            if(arr[0][0]==0)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[0][0]==1)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
        if(arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2] && arr[0][0]!=-1)
        {
            if(arr[0][0]==0)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[0][0]==1)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
        if(arr[0][1]==arr[1][1] && arr[0][1]==arr[2][1] && arr[0][1]!=-1)
        {
            if(arr[0][1]==0)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[0][1]==1)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
        if(arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2] && arr[0][2]!=-1)
        {
            if(arr[0][2]==0)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[0][2]==1)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
        if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0] && arr[0][2]!=-1)
        {
            if(arr[0][2]==0)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[0][2]==1)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
        if(arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2] && arr[1][0]!=-1)
        {
            if(arr[1][0]==0)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[1][0]==1)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
        if(arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2] && arr[2][0]!=-1)
        {
            if(arr[2][0]==0)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName1")
                count1++;
                player1score?.text=count1.toString()
            }
            if(arr[2][0]==1)
            {
                WinnerName?.text = "Winner " + intent.getStringExtra("PlayerName2")
                count2++
                player2score?.text=count2.toString()
            }

        }
    }
    private fun default()
    {
        tv1?.text=""
        tv2?.text=""
        tv3?.text=""
        tv4?.text=""
        tv5?.text=""
        tv6?.text=""
        tv7?.text=""
        tv8?.text=""
        tv9?.text=""
        for(i in 0..2)
        {
            for(j in 0..2)
            {
                arr[i][j]=-1
            }
        }
        flag=0
    }
    private fun count()
    {
        total++;
        if(total==9)
        {
            WinnerName?.text="Draw"
        }
    }
}