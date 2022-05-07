package com.example.calanderexample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalenderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val dayOfMonth: TextView = itemView.findViewById(R.id.cellDayText)

}