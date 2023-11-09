package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private var loginuser : Button? = null
    private var username : EditText? = null
    private var password : EditText? = null
    private var register : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById(R.id.edt_username)
        password = findViewById(R.id.edt_password)
        register = findViewById(R.id.btn_register)
        register!!.setOnClickListener{ openMenuRegister() }
        loginuser = findViewById(R.id.btn_login)
        loginuser!!.setOnClickListener{ openMenuHome() }

    }
    private fun openMenuHome(){
        if (username!!.text.toString() == "gery" && password!!.text.toString() == "1234") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
        }
    }
    private fun openMenuRegister(){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}