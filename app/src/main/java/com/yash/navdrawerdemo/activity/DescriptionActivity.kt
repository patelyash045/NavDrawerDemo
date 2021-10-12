package com.yash.navdrawerdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.EventLogTags
import android.widget.TextView
import com.yash.navdrawerdemo.R

class DescriptionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val headingSong : TextView = findViewById(R.id.txTitle)
        val descriptionSong : TextView = findViewById(R.id.txDescription)
        val lyricsSong : TextView = findViewById(R.id.lyrics)

        val bundle : Bundle? = intent.extras
        val title = bundle!!.getString("title")
        val description = bundle.getString("description")
        val lyrics = bundle.getString("lyrics")

        headingSong.text = title
        descriptionSong.text = description
        lyricsSong.text = lyrics

    }
}