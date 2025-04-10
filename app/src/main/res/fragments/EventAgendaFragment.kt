package com.itevent.app.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.itevent.app.adapters.AttendeeAdapter
import com.itevent.app.databinding.FragmentEventAgendaBinding
import com.itevent.app.models.Attendee

class EventAgendaFragment : Fragment() {

    private var _binding: FragmentEventAgendaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentEventAgendaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val attendees = listOf(
            Attendee("Roberto Gómez"),
            Attendee("MJ Cortes"),
            Attendee("Paola Sánchez")
        )

        binding.rvAttendees.layoutManager = LinearLayoutManager(requireContext())
        binding.rvAttendees.adapter = AttendeeAdapter(attendees)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}