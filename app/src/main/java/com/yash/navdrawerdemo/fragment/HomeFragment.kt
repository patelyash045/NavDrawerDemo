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

        songsObjects.add(Song("Hello","Just the description"))
        songsObjects.add(Song("ABCD","John Lennon"))
        songsObjects.add(Song("Dance","The Rolling Stones"))
        songsObjects.add(Song("Chill","The Beatles"))
        songsObjects.add(Song("Coders Life","Just the description"))
        songsObjects.add(Song("Adayein Bhi Hain Mohobbat","Ok Jaanu"))
        songsObjects.add(Song("Aye Udi Udi","Sathiya"))
        songsObjects.add(Song("Enna Sona","Random Data"))
        songsObjects.add(Song("IT IT IT","Hello"))
        songsObjects.add(Song("Agar Tum Mil Jao","Ok Jaanu"))
        songsObjects.add(Song("Ban Ja Rani","Sulu"))
        songsObjects.add(Song("Mukkabla","Street Dancers"))

        recyclerview.adapter = HomeAdapter(songsObjects)
        recyclerview.layoutManager = LinearLayoutManager(activity)

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}