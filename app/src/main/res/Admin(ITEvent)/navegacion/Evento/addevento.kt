package com.itevent.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.itevent.app.databinding.FragmentAddEventBinding

class AddEventFragment : Fragment() {

    private var _binding: FragmentAddEventBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAddEventBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnAddEvent.setOnClickListener {
            val name = binding.etEventName.text.toString()
            val desc = binding.etEventDescription.text.toString()

            if (name.isNotEmpty() && desc.isNotEmpty()) {
                Toast.makeText(requireContext(), "Evento agregado", Toast.LENGTH_SHORT).show()
                // Aquí podrías guardar el evento en base de datos o API
            } else {
                Toast.makeText(requireContext(), "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
