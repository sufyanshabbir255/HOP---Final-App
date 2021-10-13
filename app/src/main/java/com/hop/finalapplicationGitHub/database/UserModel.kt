package com.hop.finalapplicationGitHub.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "userInfo")
class UserModel(
    @PrimaryKey
    var id: Int = 1,
    var name: String,
    var password: String
) : Parcelable