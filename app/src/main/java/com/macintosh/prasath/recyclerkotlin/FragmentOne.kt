package com.macintosh.prasath.recyclerkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout


class FragmentOne : Fragment() {



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val v = inflater!!.inflate(R.layout.fragment_one, container, false)
        val recyclerView = v.findViewById<RecyclerView>(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(activity,LinearLayout.VERTICAL,false);

        /*val users = ArrayList<User>()
        users.add(User("Prasath"));
        users.add(User("Siva"));
        users.add(User("Junior"));
        users.add(User("Muthu"));
        users.add(User("Valarmathi"));*/
        val users = ArrayList<User>()
        val user = User("prasath");
        users.add(user);
        val user1 = User("prasath");
        users.add(user1);
        val user2 = User("prasath");
        users.add(user2);



        val adapter = CustomRecyclerAdapter(users,R.layout.recycler_layout,activity);


        recyclerView.adapter = adapter
        return v;
    }

}
