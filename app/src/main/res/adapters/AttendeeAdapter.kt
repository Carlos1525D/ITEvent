package com.itevent.app.adapters

import android.view.*
import androidx.recyclerview.widget.RecyclerView
import com.itevent.app.databinding.ItemAttendeeBinding
import com.itevent.app.models.Attendee

class AttendeeAdapter(private val list: List<Attendee>) :
    RecyclerView.Adapter<AttendeeAdapter.AttendeeViewHolder>() {

    inner class AttendeeViewHolder(val binding: ItemAttendeeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(attendee: Attendee) {
            binding.tvAttendeeName.text = attendee.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttendeeViewHolder {
        val binding = ItemAttendeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AttendeeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AttendeeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size
}