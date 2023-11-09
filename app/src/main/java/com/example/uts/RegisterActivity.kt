package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RegisterActivity : AppCompatActivity() {
    private var Login : Button? = null
    private var back : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Login = findViewById(R.id.btn_register)
        Login!!.setOnClickListener{ openMenuLogin() }
        back = findViewById(R.id.btn_kembali)
        back!!.setOnClickListener{ openMenuLogin() }
    }
    private fun openMenuLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}