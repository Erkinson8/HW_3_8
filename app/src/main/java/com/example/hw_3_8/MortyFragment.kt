package com.example.hw_3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw_3_8.databinding.FragmentMortyBinding


class MortyFragment : Fragment() {

    private lateinit var binding: FragmentMortyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMortyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    binding.btnMorty.setOnClickListener {
        findNavController().navigate(R.id.action_mortyFragment_to_einsteinFragment)
    }
}
}

