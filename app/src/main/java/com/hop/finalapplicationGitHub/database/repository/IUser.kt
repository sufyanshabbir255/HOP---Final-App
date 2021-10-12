package com.hop.finalapplicationGitHub.database.repository

import com.hop.finalapplicationGitHub.database.UserModel

interface IUser {
    fun addUser(userData: UserModel)
    fun getUsers(): List<UserModel>
}