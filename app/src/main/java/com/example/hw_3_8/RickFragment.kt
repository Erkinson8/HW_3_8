package com.example.hw_3_8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw_3_8.databinding.FragmentRickBinding



class RickFragment : Fragment() {

    private lateinit var binding: FragmentRickBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentRickBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRick.setOnClickListener{
       findNavController().navigate(R.id.action_rickFragment_to_mortyFragment)

        }
    }
}
