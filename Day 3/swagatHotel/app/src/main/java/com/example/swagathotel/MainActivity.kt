package com.example.swagathotel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.example.swagathotel.Counts as Counts



class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customer.setOnClickListener(){
            var intent=Intent(this,Counts::class.java)
            startActivity(intent)

        }

        menubut.setOnClickListener(){
            var intent=Intent(this,Menusad::class.java)
            startActivity(intent)

        }

    }
}