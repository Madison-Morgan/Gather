package com.example.calanderexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter(days: ArrayList<String>) : RecyclerView.Adapter<CalenderViewHolder>() {

    private val daysOfMonth : ArrayList<String> = days

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalenderViewHolder {
        var inflater: LayoutInflater = LayoutInflater.from(parent.context)
        var view: View = inflater.inflate(R.layout.calender_cell, parent, false)
        var layoutParams : ViewGroup.LayoutParams = view.layoutParams
        layoutParams.height = (parent.height * 0.16666666).toInt()
        return CalenderViewHolder(view)
    }

    override fun onBindViewHolder(holder: CalenderViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}