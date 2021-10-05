package com.hop.finalapplicationGitHub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import finalapplicationGitHub.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener {
            val loginIntent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }

        btnSignUp.setOnClickListener {
            val signUpIntent = Intent(this, SignUpActivity::class.java)
            startActivity(signUpIntent)
        }
    }
}