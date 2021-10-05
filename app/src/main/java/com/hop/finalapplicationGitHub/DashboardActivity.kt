package com.hop.finalapplicationGitHub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import finalapplicationGitHub.R
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val getNameValue = intent.getStringExtra("name")
        tvDashBoard.text = "$getNameValue welcome to dashboard"
    }
}