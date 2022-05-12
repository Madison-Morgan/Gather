package company.project.gather

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CalendarAdapter (private val daysOfMonth: ArrayList<String>, private val onItem: OnItemListener) : RecyclerView.Adapter<CalenderViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalenderViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.calender_cell, parent, false)
        val layoutParams : ViewGroup.LayoutParams = view.layoutParams
        layoutParams.height = (parent.height * 0.166666666).toInt()
        return CalenderViewHolder(view, onItem)
    }

    override fun onBindViewHolder(holder: CalenderViewHolder, position: Int) {
        holder.dayOfMonth.text = daysOfMonth[position]
    }

    override fun getItemCount(): Int {
        return daysOfMonth.size
    }

    interface OnItemListener {
        fun onItemClick(position: Int, dayText: String)
    }

}