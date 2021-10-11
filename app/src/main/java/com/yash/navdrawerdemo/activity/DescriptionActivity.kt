package com.yash.navdrawerdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.EventLogTags
import android.widget.TextView
import com.yash.navdrawerdemo.R

class DescriptionActivity : AppCompatActivity() {

    //lateinit var txtTitleDes: TextView
    //lateinit var txtDescriptionDes: TextView
    //lateinit var txtLyrics: TextView


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

        /*
        txtTitleDes = findViewById(R.id.txtTitle)
        txtDescriptionDes = findViewById(R.id.txtDescription)
        txtLyrics = findViewById(R.id.Lyrics)

        val bundle: Bundle? = intent.extras
        val Title = bundle!!.getString("txtTitle")
        val Description = bundle.getString("txtDescription")

        val Lyrics = bundle.getString("txtLyrics")

        txtTitleDes.text = Title
        txtDescriptionDes.text = Description
        txtLyrics.text = Lyrics  */
    }
}