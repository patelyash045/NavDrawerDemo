package com.yash.navdrawerdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yash.navdrawerdemo.R
import com.yash.navdrawerdemo.adapter.HomeAdapter
import com.yash.navdrawerdemo.data.Song

class HomeFragment : Fragment() {

    lateinit var recyclerview : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, true)

        recyclerview = view.findViewById(R.id.songList)
        val songsObjects : MutableList<Song> = mutableListOf<Song>()

        songsObjects.add(Song("Tum Hi ho","Aashiqui 2 Popular Song"))
        songsObjects.add(Song("Chahun Main Ya Naa","Aashiqui 2 Popular Song"))
        songsObjects.add(Song("Raabta","Agent Vinod Popular Song"))
        songsObjects.add(Song("Galiyan","Ek Villian Popular Song"))
        songsObjects.add(Song("Baarish","Yaariyan Popular Song"))
        songsObjects.add(Song("Sunny Sunny","Yaariyan Popular Song"))
        songsObjects.add(Song("Bekhayali","Kabir Singh Popular Song"))
        songsObjects.add(Song("Tera Ban Jaunga","Kabir Singh Popular Song"))
        songsObjects.add(Song("Pehla Pyaar","Kabir Singh Popular Song"))
        songsObjects.add(Song("Kaise Hua","Kabir Singh Popular Song"))
        songsObjects.add(Song("Kaun Tujhe","M.S.Dhoni Untold Story Popular Song"))
        songsObjects.add(Song("Muqabla","Street Dancers Popular Song"))

        recyclerview.adapter = HomeAdapter(songsObjects)
        recyclerview.layoutManager = LinearLayoutManager(activity)

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}