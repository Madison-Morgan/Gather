package company.project.gather

import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalenderViewHolder(private val itemView: View, private val onItemListener: CalendarAdapter.OnItemListener?) : RecyclerView.ViewHolder(itemView), OnClickListener {
    var dayOfMonth: TextView
    init {
        itemView.setOnClickListener(this)
        dayOfMonth = itemView.findViewById((R.id.cellDayText))
    }

    override fun onClick(v: View?) {
        onItemListener?.onItemClick(adapterPosition,dayOfMonth.text.toString())
    }
}
