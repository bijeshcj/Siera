package com.bijesh.sieraapp.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bijesh.sieraapp.R
//import com.bijesh.sieraapp.models.Users
import kotlinx.android.synthetic.main.recycler_item.view.*

class UserAdaptor : RecyclerView.Adapter<UserViewHolder>() {

//    var userList = mutableListOf<Users>()
//
//    fun setUsers(users: List<Users>) {
//        this.userList = users.toMutableList()
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
//        val user = userList[position]
//        holder.username.text = user.userName
//        holder.number.text = user.number
    }

    override fun getItemCount(): Int {
        return 0//userList.size
    }
}

class UserViewHolder(view:View): RecyclerView.ViewHolder(view){
    val username = view.textViewUsername
    val number = view.textViewNumber
}