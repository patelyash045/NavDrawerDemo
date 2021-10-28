package com.yash.navdrawerdemo.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yash.navdrawerdemo.R
import com.yash.navdrawerdemo.activity.DescriptionActivity
import com.yash.navdrawerdemo.adapter.HomeAdapter
import com.yash.navdrawerdemo.data.Song

class HomeFragment : Fragment() {

    lateinit var recyclerview : RecyclerView
    lateinit var lyricsArray : Array<String>

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

        lyricsArray = arrayOf(
            getString(R.string.song_1),
            getString(R.string.song_2),
            getString(R.string.song_3),
            getString(R.string.song_4),
            getString(R.string.song_5),
            getString(R.string.song_6),
            getString(R.string.song_7),
            getString(R.string.song_8),
            getString(R.string.song_9),
            getString(R.string.song_10),
            getString(R.string.song_11),
            getString(R.string.song_12)
        )

        val adapter = HomeAdapter(songsObjects)
        recyclerview.adapter = adapter
        adapter.setOnItemClickListener(object : HomeAdapter.onItemClikListener{
            override fun onItemClick(position: Int) {

                Toast.makeText(activity,"Clicked $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(activity,DescriptionActivity::class.java)
                intent.putExtra("title",songsObjects[position].title)
                intent.putExtra("description",songsObjects[position].description)
                intent.putExtra("lyrics",lyricsArray[position])
                startActivity(intent)
            }

        })
        recyclerview.layoutManager = LinearLayoutManager(activity)


        return inflater.inflate(R.layout.fragment_home, container, false)
    }



}