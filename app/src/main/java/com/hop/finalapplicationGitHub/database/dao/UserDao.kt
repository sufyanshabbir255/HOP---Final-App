package com.hop.finalapplicationGitHub.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.hop.finalapplicationGitHub.database.UserModel

@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    fun addUser(user: UserModel)

    @Query("SELECT * FROM userInfo")
    fun getUsers(): List<UserModel>

}