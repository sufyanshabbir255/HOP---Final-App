package com.hop.finalapplicationGitHub.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import finalapplicationGitHub.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnSignIn.setOnClickListener {
            val value = etName.text.toString()
            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra("name",value)
            startActivity(intent)
        }
    }
}