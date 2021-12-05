package com.bijesh.sieraapp.screens

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bijesh.sieraapp.R
//import com.bijesh.sieraapp.models.Users
import com.bijesh.sieraapp.repos.UserRepository
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_add_new_user.*

class AddNewUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_user)

        val userRepo : UserRepository = UserRepository(this)
        button.setOnClickListener{
            if(editTextPersonName.text.isNotEmpty() && editTextNumber.text.isNotEmpty()){
                kotlin.run {
//                    val users = Users(userName = editTextPersonName.text.toString(), number =  editTextNumber.text.toString())
//                    userRepo.insertUser(users)
                }
            }else{
                Toast.makeText(this,"Enter Name and Number to save record",Toast.LENGTH_LONG).show()
            }
            this.finish()
        }

    }


}