package com.itevent.app.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.itevent.app.adapters.NotificationAdapter
import com.itevent.app.databinding.FragmentNotificationsBinding
import com.itevent.app.models.Notification

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val notifications = listOf(
            Notification("Paola se ha unido al evento"),
            Notification("Tienes una reunión mañana"),
            Notification("Tu perfil fue actualizado")
        )

        binding.rvNotifications.layoutManager = LinearLayoutManager(requireContext())
        binding.rvNotifications.adapter = NotificationAdapter(notifications)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}