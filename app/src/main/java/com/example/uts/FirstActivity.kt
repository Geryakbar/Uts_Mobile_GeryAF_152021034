package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    private var mulai : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        mulai = findViewById(R.id.btn_join)
        mulai!!.setOnClickListener{ openMenuLogin() }
    }

    private fun openMenuLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}