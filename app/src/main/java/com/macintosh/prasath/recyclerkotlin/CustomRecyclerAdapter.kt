package com.macintosh.prasath.recyclerkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class CustomRecyclerAdapter(val userList:ArrayList<User>,val layout: Int,val ctx:Context):RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        //val user : User = userList[position]

        holder?.textViewName?.text = userList[position].name;

        holder?.itemView?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(ctx,"Position :  "+position, Toast.LENGTH_SHORT).show();
            }

        })
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById<TextView>(R.id.textViewName)
    }

}