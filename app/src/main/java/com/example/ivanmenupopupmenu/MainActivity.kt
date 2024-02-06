package com.example.ivanmenupopupmenu

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorList = listOf(
            ColorData(R.drawable.circle_background, "Rojo"),
            ColorData(R.drawable.circle_background_green, "Verde"),
            ColorData(R.drawable.circle_background_blue, "Azul"),
            ColorData(R.drawable.circle_background_yellow, "Amarillo")
        )

        val adapter = ColorAdapter(this, colorList)

        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter
    }
}


