package com.bijesh.sieraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bijesh.sieraapp.adaptors.UserAdaptor
import com.bijesh.sieraapp.repos.UserRepository
import com.bijesh.sieraapp.screens.AddNewUserActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : UserAdaptor
    private val repo : UserRepository by lazy {
        UserRepository(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapter = UserAdaptor()
//        recyclerviewUsers.layoutManager = LinearLayoutManager(this)
//        recyclerviewUsers.adapter = adapter
//
//        floatingActionButton.setOnClickListener{
//            val intent = Intent(this@MainActivity,AddNewUserActivity::class.java)
//            startActivity(intent)
//        }

    }

    override fun onResume() {
        super.onResume()
        populateUsers()
    }

    fun populateUsers() {
//        val allUsers = repo.getAllUsers()
//        adapter.setUsers(allUsers)
    }
}