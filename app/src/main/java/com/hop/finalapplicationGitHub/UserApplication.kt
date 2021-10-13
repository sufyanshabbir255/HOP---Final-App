package com.hop.finalapplicationGitHub

import android.app.Application
import com.hop.finalapplicationGitHub.database.UserDatabase
import com.hop.finalapplicationGitHub.database.repository.UserRepository

class UserApplication : Application() {

    companion object {
        lateinit var context: Application
//        val userDatabase: UserDatabase = UserDatabase.buildDatabase(context)
        val userDatabase: UserDatabase by lazy {
            UserDatabase.buildDatabase(context)
        }
        var repository = UserRepository(userDatabase.userDao())
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }

}