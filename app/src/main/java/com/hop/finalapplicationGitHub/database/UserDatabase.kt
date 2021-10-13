package com.hop.finalapplicationGitHub.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hop.finalapplicationGitHub.database.dao.UserDao

const val DATABASE_VERSION = 1

@Database(entities = [UserModel::class], version = DATABASE_VERSION)
abstract class UserDatabase : RoomDatabase() {
    companion object {
        var DATA_BASE_NAME = "studentData"
        fun buildDatabase(context: Context): UserDatabase {
            return Room.databaseBuilder(
                context,
                UserDatabase::class.java,
                DATA_BASE_NAME
            )
                .allowMainThreadQueries().build()
        }
    }

    abstract fun userDao(): UserDao

}