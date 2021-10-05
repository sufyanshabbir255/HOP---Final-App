package com.hop.finalapplicationGitHub.database

import android.content.Context
import androidx.room.Database

const val DATABASE_VERSION = 1

@Database(entities = [UserModel::class],version = DATABASE_VERSION)
abstract class UserDatabase {
    companion object{
        var DATA_BASE_NAME= "studentData"

    }

}