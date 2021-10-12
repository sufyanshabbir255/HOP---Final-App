package com.hop.finalapplicationGitHub.database.repository

import com.hop.finalapplicationGitHub.database.UserModel
import com.hop.finalapplicationGitHub.database.dao.UserDao

class UserRepository(var userDao: UserDao): IUser {

    override fun addUser(userData: UserModel) {
        userDao.addUser(user = userData)
    }

    override fun getUsers(): List<UserModel> {
       return userDao.getUsers()
    }

}