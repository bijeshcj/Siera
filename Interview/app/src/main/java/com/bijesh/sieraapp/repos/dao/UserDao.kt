package com.bijesh.sieraapp.repos.dao

import androidx.room.*
import com.example.roomandroidexample.Users

//import com.bijesh.sieraapp.models.Users

@Dao
interface UserDao {

    @Insert
    fun insertUser(users: Users)

    @Query("Select * from user")
    fun gelAllUsers(): List<Users>

    @Update
    fun updateUser(users: Users)

    @Delete
    fun deleteUser(users: Users)

}