package com.hop.finalapplicationGitHub.ui

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hop.finalapplicationGitHub.UserApplication
import com.hop.finalapplicationGitHub.database.UserModel
import com.hop.finalapplicationGitHub.database.repository.UserRepository
import finalapplicationGitHub.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var repository : UserRepository = UserApplication.repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        repository.addUser(UserModel(name = etName.text.toString(),password = etPassword.text.toString()))
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