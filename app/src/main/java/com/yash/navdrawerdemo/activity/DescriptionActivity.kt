package com.yash.navdrawerdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.yash.navdrawerdemo.R

class DescriptionActivity : AppCompatActivity() {

    lateinit var txtTitleDes: TextView
    lateinit var txtDescriptionDes: TextView
    lateinit var txtLyrics: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        txtTitleDes = findViewById(R.id.txtTitleDes)
        txtDescriptionDes = findViewById(R.id.txtDescriptionDes)
        txtLyrics = findViewById(R.id.Lyrics)
    }
}