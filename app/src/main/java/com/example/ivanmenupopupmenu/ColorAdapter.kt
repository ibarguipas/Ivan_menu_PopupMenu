package com.example.ivanmenupopupmenu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class ColorAdapter(context: Context, private val colorList: List<ColorData>) :
    ArrayAdapter<ColorData>(context, 0, colorList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = convertView ?: createColorItemView(parent)
        val colorData = getItem(position)

        val colorImageView: ImageView = itemView.findViewById(R.id.colorImageView)
        val colorNameTextView: TextView = itemView.findViewById(R.id.colorNameTextView)
        val imageButton: ImageButton = itemView.findViewById(R.id.imageButton)

        colorImageView.setBackgroundResource(colorData!!.colorResId)
        colorNameTextView.text = colorData.colorName


        imageButton.setOnClickListener { view ->
            showPopupMenu(view, colorData.colorName)
        }

        return itemView
    }

    private fun createColorItemView(parent: ViewGroup): View {
        return LayoutInflater.from(context).inflate(R.layout.item_color, parent, false)
    }

    private fun showPopupMenu(view: View, colorName: String) {
        val popupMenu = PopupMenu(context, view)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)

        popupMenu.show()
    }

}


